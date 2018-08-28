package com.dyj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dyj.model.PageBean;
import com.dyj.model.Operate;
import com.dyj.model.Storage;
import com.dyj.util.DateUtil;
import com.dyj.util.StringUtil;

public class OperateDao {

	public ResultSet operateList(Connection con, PageBean pageBean,
			Operate operate) throws Exception {
		StringBuffer sb = new StringBuffer();

		sb.append(" SELECT o.id, concat(u.userName,'(',o.userid,')') userid, o.operatetime, ");
		sb.append(" (case when o.operateType = 1 then '入库' ");
		sb.append(" when o.operateType = 2 then '出库' ");
		sb.append(" else  o.operateType end) operateTypetest, ");
		sb.append(" o.operateType operateType, o.remark, ");
		sb.append(" concat(g.goodname, '(', o.goodid, ')') goodname ");
		sb.append(" FROM t_operate o, t_good g,t_user u ");
		sb.append(" WHERE o.goodid = g.id and u.id=o.userid ");

		if (operate != null && StringUtil.isNotEmpty(operate.getGoodname())) {
			sb.append(" and g.goodname like '%" + operate.getGoodname() + "%'");
		}
		sb.append(" order by o.id desc ");
		if (pageBean != null) {
			sb.append(" limit " + pageBean.getStart() + ","
					+ pageBean.getRows());
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}

	public int operateCount(Connection con, Operate operate) throws Exception {
		StringBuffer sb = new StringBuffer(
				"select count(*) as total from t_operate,t_good where t_operate.goodid=t_good.id");
		if (StringUtil.isNotEmpty(operate.getGoodname())) {
			sb.append(" and goodname like '%" + operate.getGoodname() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getInt("total");
		} else {
			return 0;
		}
	}

	public int operateAdd(Connection con, Operate operate) throws Exception {

		String sql = "INSERT INTO t_operate (id,userid,operatetime,operateType,remark,goodid,storageid) values(null,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, operate.getUserid());
		pstmt.setString(2,
				DateUtil.formatDate(operate.getOperatetime(), "yyyy-MM-dd"));
		pstmt.setInt(3, operate.getOperateType());
		pstmt.setString(4, operate.getRemark());
		pstmt.setInt(5, operate.getGoodid());
		pstmt.setInt(6, operate.getStorageid());
		pstmt.executeUpdate();
		return 1;
	}

}
