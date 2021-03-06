package com.dyj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import com.dyj.model.Good;
import com.dyj.model.Goodcategories;
import com.dyj.model.PageBean;
import com.dyj.util.StringUtil;

public class GoodDao {
	public ArrayList<Good> getGoodList(Connection con, String sql)
			throws Exception {
		ArrayList<Good> goodList = new ArrayList<Good>();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Good good = new Good();
			good.setId(Integer.parseInt(rs.getString("id")));
			good.setGoodname(rs.getString("goodname"));
			good.setGoodmumber(rs.getString("goodmumber"));
			// good.setPhoto(rs.getString("photo"));
			goodList.add(good);
		}
		return goodList;
	}

	public String[] getGood(Connection con, int a) throws Exception {
		String[] goodList = new String[a];
		int count = 0;
		String sql = "select goodname from t_good";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			goodList[count] = rs.getString("goodname");
			count++;
		}
		return goodList;
	}

	public String count(Connection con) throws Exception {
		String sql = "SELECT COUNT(*)as count FROM t_good";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getString("count");
		}
		return null;
	}

	public ResultSet goodList(Connection con, PageBean pageBean, Good good)
			throws Exception {
		StringBuffer sb = new StringBuffer(
				"select g.id id,g.goodname goodname,concat(gc.goodname,'(',g.goodcategoriesid,')') goodcategoriesid,g.note from t_good g left join t_goodcategories gc on g.goodcategoriesid = gc.id ");
		if (good != null && StringUtil.isNotEmpty(good.getGoodname())) {
			sb.append(" and g.goodname like '%" + good.getGoodname() + "%'");
		}

		sb.append(" order by g.id desc ");

		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString()
				.replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}

	public int goodCount(Connection con, Good good) throws Exception {
		StringBuffer sb = new StringBuffer(
				"select count(*) as total from t_good");
		if (StringUtil.isNotEmpty(good.getGoodname())) {
			sb.append(" and goodname like '%" + good.getGoodname() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString()
				.replaceFirst("and", "where"));
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getInt("total");
		} else {
			return 0;
		}
	}

	public int goodDelete(Connection con, String delIds) throws Exception {
		String sql = "delete from t_good where id in(" + delIds + ")";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	public int goodAdd(Connection con, Good good) throws Exception {

		String sql = "insert into t_good(id,goodname,goodcategoriesid,note) "
				+ "values(null,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		// pstmt.setString(1, good.getGoodnumber());
		pstmt.setString(1, good.getGoodname());
		// pstmt.setString(2, "");
		pstmt.setString(2, good.getGoodcategoriesid());
		pstmt.setString(3, good.getNote());
		// pstmt.setString(4, "");
		return pstmt.executeUpdate();
	}

	public int goodModify(Connection con, Good good) throws Exception {
		String sql = "update t_good set goodname=?,goodcategoriesid=?,note=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		// pstmt.setString(1, good.getGoodnumber());
		pstmt.setString(1, good.getGoodname());
		pstmt.setString(2, good.getGoodcategoriesid());
		pstmt.setString(3, good.getNote());
		pstmt.setInt(4, good.getId());
		return pstmt.executeUpdate();
	}

	public boolean getGoodByGoodcategoriesId(Connection con,
			String goodcategoriesId) throws Exception {
		String sql = "select * from t_good where goodcategoriesId=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, goodcategoriesId);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getGoodBySupplierId(Connection con, String supplierid)
			throws Exception {
		String sql = "select * from t_good where supplierid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, supplierid);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	public String getGoodById(Connection con, String id) throws Exception {
		String sql = "select * from t_good where id=?";
		String s = null;
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			s = rs.getString("goodname");
		}
		return s;
	}
}
