package com.dyj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dyj.model.Goodcategories;
import com.dyj.model.PageBean;
import com.dyj.model.Stock;
import com.dyj.util.StringUtil;

public class StockDao {
	public ArrayList<Stock> getStockList(Connection con) throws Exception {
		ArrayList<Stock> StockList = new ArrayList<Stock>();
		String sql = "select * from t_stock";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Stock stock = new Stock();
			stock.setGoodnumber(Integer.parseInt(rs.getString("goodnumber")));
			StockList.add(stock);
		}
		return StockList;
	}

	public ResultSet stockList(Connection con, PageBean pageBean, Stock stock)
			throws Exception {
		StringBuffer sb = new StringBuffer();

		sb.append(" SELECT distinct stockid, goodname, ");
		sb.append(" (select saleprice from t_outstock where t_stock.outstockid = t_outstock.outstockid) saleprice, ");
		sb.append(" t_stock.goodnumber, stocknote, t_stock.goodid, inprice, ");
		sb.append(" t_storage.id, t_storage.storageunit, 0 outstockid ");
		sb.append(" FROM t_stock, t_good, t_storage, t_outstock ");
		sb.append(" WHERE t_stock.goodid = t_good.id ");
		sb.append(" AND t_stock.storageid = t_storage.id ");

		if (stock != null && StringUtil.isNotEmpty(stock.getGoodname())) {
			sb.append(" and goodname like '%" + stock.getGoodname() + "%'");
		}

		sb.append(" order by stockid desc ");
		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public ResultSet stockList2(Connection con, PageBean pageBean, Stock stock)
			throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT g.id id, ");
		sb.append(" g.goodname goodname, ");
		sb.append(" s.inprice inprice, ");
		sb.append(" o.saleprice saleprice, ");
		sb.append(" s.storagenumber storagenumber, ");
		sb.append(" o.outstocknumber outstocknumber, ");
		sb.append(" (s.storagenumber - o.outstocknumber) stocknum, ");
		sb.append(" o.outstockid outstockid, ");
		sb.append(" s.id storageid ");
		sb.append(" FROM t_outstock o, t_good g, t_storage s ");
		sb.append(" WHERE o.goodid = g.id ");
		sb.append(" AND s.goodid = g.id ");

		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public ResultSet stockList3(Connection con, PageBean pageBean, Stock stock)
			throws Exception {
		StringBuffer sb = new StringBuffer(
				"SELECT goodname,t_stock.goodnumber,inprice,t_outstock.saleprice,stocknote,t_outstock.goodid,t_outstock.outstockid,t_storage.id FROM t_stock,t_good,t_storage,t_outstock WHERE t_stock.goodid=t_good.id AND t_stock.outstockid=t_outstock.outstockid AND t_stock.storageid=t_storage.id");
		if (stock != null && StringUtil.isNotEmpty(stock.getGoodname())) {
			sb.append(" and goodname like '%" + stock.getGoodname() + "%'");
		}
		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public int stockCount(Connection con, Stock stock) throws Exception {
		StringBuffer sb = new StringBuffer(
				"select count(*) as total from t_stock,t_good where t_stock.goodid=t_good.id");
		if (StringUtil.isNotEmpty(stock.getGoodname())) {
			sb.append(" and goodname like '%" + stock.getGoodname() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getInt("total");
		} else {
			return 0;
		}
	}

	public int stockDelete(Connection con, String delIds) throws Exception {
		String sql = "delete from t_stock where stockid in(" + delIds + ")";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	public int stockAdd(Connection con, Stock stock) throws Exception {
		String sql = "insert into t_stock values(null,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, stock.getGoodid());
		pstmt.setInt(2, stock.getGoodnumber());
		pstmt.setString(3, stock.getStocknote());
		pstmt.setInt(4, stock.getOutstockid());
		pstmt.setInt(5, stock.getStorageid());
		return pstmt.executeUpdate();
	}

	public int stockModify(Connection con, Stock stock) throws Exception {
		String sql = "update t_stock set goodid=?,goodnumber=?,stocknote=?,outstockid=?,storageid=? where stockid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, stock.getGoodid());
		pstmt.setInt(2, stock.getGoodnumber());
		pstmt.setString(3, stock.getStocknote());
		pstmt.setInt(4, stock.getOutstockid());
		pstmt.setInt(5, stock.getStorageid());
		pstmt.setInt(6, stock.getStockid());
		return pstmt.executeUpdate();
	}
}
