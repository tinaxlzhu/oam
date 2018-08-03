package com.dyj.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dyj.model.Good;
import com.dyj.model.Storage;
import com.dyj.model.PageBean;
import com.dyj.util.DateUtil;
import com.dyj.util.StringUtil;

public class StorageDao {
		public ResultSet storageList(Connection con,PageBean pageBean,Storage storage)throws Exception{
			StringBuffer sb=new StringBuffer("select t_storage.id,goodid,inprice,storagedate,storagenumber,storagenote,goodname,t_good.id as Goodid,storageunit from t_storage,t_good where t_storage.goodid=t_good.id");
			if(storage!=null&&StringUtil.isNotEmpty(storage.getGoodname())){
				sb.append(" and goodname like '%"+storage.getGoodname()+"%'");
			}
			sb.append(" order by t_storage.id desc ");
			
			if(pageBean!=null){
				sb.append(" limit "+pageBean.getStart()+","+pageBean.getRows());
			}
			PreparedStatement pstmt=con.prepareStatement(sb.toString());
			return pstmt.executeQuery();
		}
		public ResultSet storageList2(Connection con,PageBean pageBean,Storage storage)throws Exception{
			StringBuffer sb=new StringBuffer("select goodname,goodid,inprice,storagedate,storagenumber,storagenote,storageunit from t_storage,t_good where t_storage.goodid=t_good.id");
			if(storage!=null&&StringUtil.isNotEmpty(storage.getGoodname())){
				sb.append(" and goodname like '%"+storage.getGoodname()+"%'");
			}
			if(pageBean!=null){
				sb.append(" limit "+pageBean.getStart()+","+pageBean.getRows());
			}
			PreparedStatement pstmt=con.prepareStatement(sb.toString());
			return pstmt.executeQuery();
		}
		public ResultSet storageList3(Connection con,PageBean pageBean,Storage storage)throws Exception{
			StringBuffer sb=new StringBuffer("select goodname,goodid from t_storage,t_good where t_storage.goodid=t_good.id");
			if(storage!=null&&StringUtil.isNotEmpty(storage.getGoodname())){
				sb.append(" and goodname like '%"+storage.getGoodname()+"%'");
			}
			if(pageBean!=null){
				sb.append(" limit "+pageBean.getStart()+","+pageBean.getRows());
			}
			PreparedStatement pstmt=con.prepareStatement(sb.toString());
			return pstmt.executeQuery();
		}
		public ResultSet storageList4(Connection con,Storage storage)throws Exception{
			StringBuffer sb=new StringBuffer("select * from t_storage");
			if(storage!=null&&StringUtil.isNotEmpty(storage.getGoodname())){
				sb.append(" and goodname like '%"+storage.getGoodname()+"%'");
			}
			PreparedStatement pstmt=con.prepareStatement(sb.toString());
			return pstmt.executeQuery();
		}
		public int storageCount(Connection con,Storage storage)throws Exception{
			StringBuffer sb=new StringBuffer("select count(*) as total from t_storage,t_good where t_storage.goodid=t_good.id");
			if(StringUtil.isNotEmpty(storage.getGoodname())){
				sb.append(" and goodname like '%"+storage.getGoodname()+"%'");
			}
			PreparedStatement pstmt=con.prepareStatement(sb.toString());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt("total");
			}else{
				return 0;
			}
		}
		public int storageDelete(Connection con,String delIds)throws Exception{
			String sql="delete from t_storage where id in("+delIds+")";
			PreparedStatement pstmt=con.prepareStatement(sql);
			return pstmt.executeUpdate();
		}
		public int storageAdd(Connection con,Storage storage)throws Exception {
			String sql="insert into t_storage values(null,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, storage.getGoodid());
			pstmt.setDouble(2, storage.getInprice());
			pstmt.setString(3, DateUtil.formatDate(storage.getStoragedate(),"yyyy-MM-dd"));
			pstmt.setInt(4, storage.getStoragenumber());
			pstmt.setString(5, storage.getStoragenote());
			pstmt.setString(6, storage.getStorageunit()==null?"":storage.getStorageunit());
			pstmt.executeUpdate();
			
			String selSQL = "select max(id) from t_storage";
			PreparedStatement selstmt=con.prepareStatement(selSQL);
			ResultSet resultSet = selstmt.executeQuery();
			int storageid = 0;
			while(resultSet.next()){
				storageid = resultSet.getInt(1);
			}
			
			//新增库存信息：
			String stocksql="insert into t_stock values(null,?,?,?,?,?)";
			PreparedStatement stockpstmt=con.prepareStatement(stocksql);
			stockpstmt.setInt(1, storage.getGoodid());
			stockpstmt.setInt(2, storage.getStoragenumber());
			stockpstmt.setString(3, storage.getStoragenote());
			stockpstmt.setInt(4, 0);
			stockpstmt.setInt(5, storageid);
			stockpstmt.executeUpdate();
			
			return 1;
		}
		public int storageModify(Connection con,Storage storage)throws Exception{
			String sql="update t_storage set goodid=?,inprice=?,storagedate=?,storagenumber=?,storagenote=?,storageunit=? where id=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, storage.getGoodid());
			pstmt.setDouble(2, storage.getInprice());
			pstmt.setString(3, DateUtil.formatDate(storage.getStoragedate(),"yyyy-MM-dd"));
			pstmt.setInt(4, storage.getStoragenumber());
			pstmt.setString(5, storage.getStoragenote());
			pstmt.setString(6, storage.getStorageunit()==null?"":storage.getStorageunit());
			pstmt.setInt(7, storage.getId());
			pstmt.executeUpdate();
			
			//修改库存信息
			String stockSql = "SELECT stockid, goodid, goodnumber, stocknote, outstockid, storageid FROM t_stock where storageid="+storage.getId();
			PreparedStatement stockpstmt=con.prepareStatement(stockSql);
			ResultSet resultSet = stockpstmt.executeQuery();
			while(resultSet.next()){
				int stockid = resultSet.getInt(1);
				int goodid = resultSet.getInt(2);
				int goodnumber = resultSet.getInt(3);
				String stocknote = resultSet.getString(4);
				int outstockid = resultSet.getInt(5);
				int storageid = resultSet.getInt(6);
				String stocksql="update t_stock set goodid=?,goodnumber=?,stocknote=?,outstockid=?,storageid=? where stockid=?";
				PreparedStatement updatepstmt=con.prepareStatement(stocksql);
				updatepstmt.setInt(1, goodid);
				updatepstmt.setInt(2, goodnumber+(storage.getStoragenumber()-storage.getStoragenumberold()));
				updatepstmt.setString(3, stocknote);
				updatepstmt.setInt(4, outstockid);
				updatepstmt.setInt(5, storageid);
				updatepstmt.setInt(6, stockid);
				updatepstmt.executeUpdate();
			}
			
			return 1;
		}
}
