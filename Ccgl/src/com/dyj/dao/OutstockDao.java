package com.dyj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dyj.model.OutStock;
import com.dyj.model.PageBean;
import com.dyj.util.DateUtil;
import com.dyj.util.StringUtil;

public class OutstockDao {
	public ResultSet outstockList(Connection con, PageBean pageBean,
			OutStock outstock) throws Exception {
		StringBuffer sb = new StringBuffer(
				"select outstockid,goodname,saleprice,outstockdate,outstocknumber,outstocknote,goodid from t_outstock,t_good where t_outstock.goodid=t_good.id");
		if (outstock != null && StringUtil.isNotEmpty(outstock.getGoodname())) {
			sb.append(" and goodname like '%" + outstock.getGoodname() + "%'");
		}
		sb.append(" order by outstockid desc ");
		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public double[][] getOutstock(Connection con, String goodid)
			throws Exception {
		double[][] outstockList = new double[4][1];
		int i = 0;
		String sql = "SELECT SUM(outstocknumber) AS totalSalemember,QUARTER  FROM t_outstock WHERE goodid=? GROUP BY quarter";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, goodid);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			while (i < 4) {
				if (i == 0 && rs.getString("quarter").equals("��һ����")) {
					outstockList[i][0] = Double.parseDouble(rs
							.getString("totalSalemember"));
					i++;
				} else {
					i++;
				}
				if (i == 1 && rs.getString("quarter").equals("�ڶ�����")) {
					outstockList[i][0] = Double.parseDouble(rs
							.getString("totalSalemember"));
					i++;
				} else {
					i++;
				}
				if (i == 2 && rs.getString("quarter").equals("�����")) {
					outstockList[i][0] = Double.parseDouble(rs
							.getString("totalSalemember"));
					i++;
				} else {
					i++;
				}
				if (i == 3 && rs.getString("quarter").equals("���ļ���")) {
					outstockList[i][0] = Double.parseDouble(rs
							.getString("totalSalemember"));
					i++;
				} else {
					i++;
				}
			}
			i = 0;
		}
		return outstockList;
	}

	public ResultSet outstockList2(Connection con, PageBean pageBean,
			OutStock outstock) throws Exception {
		StringBuffer sb = new StringBuffer(
				"select goodname,saleprice,outstockdate,outstocknumber,outstocknote,goodid from t_outstock,t_good where t_outstock.goodid=t_good.id");
		if (outstock != null && StringUtil.isNotEmpty(outstock.getGoodname())) {
			sb.append(" and goodname like '%" + outstock.getGoodname() + "%'");
		}
		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public ResultSet outstockList3(Connection con, OutStock outstock)
			throws Exception {
		StringBuffer sb = new StringBuffer("select * from t_outstock");
		if (outstock != null && StringUtil.isNotEmpty(outstock.getGoodname())) {
			sb.append(" and goodname like '%" + outstock.getGoodname() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public int outstockCount(Connection con, OutStock outstock)
			throws Exception {
		StringBuffer sb = new StringBuffer(
				"select count(*) as total from t_outstock,t_good where t_outstock.goodid=t_good.id");
		if (StringUtil.isNotEmpty(outstock.getGoodname())) {
			sb.append(" and goodname like '%" + outstock.getGoodname() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getInt("total");
		} else {
			return 0;
		}
	}

	public int outstockDelete(Connection con, String delIds) throws Exception {
		String sql = "delete from t_outstock where outstockid in(" + delIds
				+ ")";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	public int outstockAdd(Connection con, OutStock outstock) throws Exception {
		String sql = "insert into t_outstock"
				+ "(outstockid,goodid,saleprice,outstockdate,outstocknumber,outstocknote,quarter,storageid) "
				+ "values(null,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, outstock.getGoodid());
		pstmt.setDouble(2, outstock.getSaleprice());
		pstmt.setString(3,
				DateUtil.formatDate(outstock.getOutstockdate(), "yyyy-MM-dd"));
		pstmt.setInt(4, outstock.getOutstocknumber());
		pstmt.setString(5, outstock.getOutstocknote());
		pstmt.setString(6, "");
		pstmt.setInt(7, outstock.getStorageid());
		pstmt.executeUpdate();

		String selSQL = "select max(outstockid) from t_outstock";
		PreparedStatement selstmt = con.prepareStatement(selSQL);
		ResultSet resultSet = selstmt.executeQuery();
		int outstockid = 0;
		while (resultSet.next()) {
			outstockid = resultSet.getInt(1);
		}

		// 修改库存信息  根据进货ID查询
		String stockSql = "SELECT stockid, goodid, goodnumber, stocknote, outstockid, storageid "
				+ " FROM t_stock where storageid="
				+ outstock.getStorageid();
		PreparedStatement stockpstmt = con.prepareStatement(stockSql);
		ResultSet stockSet = stockpstmt.executeQuery();
		while (stockSet.next()) {
			int stockid = stockSet.getInt(1);
			int goodid = stockSet.getInt(2);
			int goodnumber = stockSet.getInt(3);
			int storageid = stockSet.getInt(6);
			// 修改库存量，通过商品ID更新
			String stocksql = "update t_stock set goodid=?,goodnumber=?,stocknote=?,outstockid=?,storageid=? where stockid=?";
			PreparedStatement updatepstmt = con.prepareStatement(stocksql);
			updatepstmt.setInt(1, goodid);// 原商品量-出库量
			updatepstmt.setInt(2, goodnumber - outstock.getOutstocknumber());// 原商品量-出库量
			updatepstmt.setString(3, outstock.getOutstocknote());
			updatepstmt.setInt(4, outstockid);
			updatepstmt.setInt(5, storageid);
			updatepstmt.setInt(6, stockid);
			updatepstmt.executeUpdate();
		}

		return 1;
	}

	public int outstockModify(Connection con, OutStock outstock)
			throws Exception {
		String sql = "update t_outstock set goodid=?,saleprice=?,outstockdate=?,outstocknumber=?,outstocknote=? where outstockid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, outstock.getGoodid());
		pstmt.setDouble(2, outstock.getSaleprice());
		pstmt.setString(3,
				DateUtil.formatDate(outstock.getOutstockdate(), "yyyy-MM-dd"));
		pstmt.setInt(4, outstock.getOutstocknumber());
		pstmt.setString(5, outstock.getOutstocknote());
		pstmt.setInt(6, outstock.getOutstockid());
		pstmt.executeUpdate();

		// 修改库存信息
		String stockSql = "SELECT stockid, goodid, goodnumber, stocknote, outstockid, storageid FROM t_stock where outstockid="
				+ outstock.getOutstockid();
		PreparedStatement stockpstmt = con.prepareStatement(stockSql);
		ResultSet resultSet = stockpstmt.executeQuery();
		while (resultSet.next()) {
			int stockid = resultSet.getInt(1);
			int goodid = resultSet.getInt(2);
			int goodnumber = resultSet.getInt(3);
			String stocknote = resultSet.getString(4);
			int outstockid = resultSet.getInt(5);
			int storageid = resultSet.getInt(6);
			String stocksql = "update t_stock set goodid=?,goodnumber=?,stocknote=?,outstockid=?,storageid=? where stockid=?";
			PreparedStatement updatepstmt = con.prepareStatement(stocksql);
			updatepstmt.setInt(1, goodid);
			updatepstmt.setInt(
					2,
					goodnumber
							- (outstock.getOutstocknumber() - outstock
									.getOutstocknumberold()));
			updatepstmt.setString(3, stocknote);
			updatepstmt.setInt(4, outstockid);
			updatepstmt.setInt(5, storageid);
			updatepstmt.setInt(6, stockid);
			updatepstmt.executeUpdate();
		}

		return 1;
	}
}
