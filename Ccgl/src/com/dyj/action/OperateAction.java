package com.dyj.action;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.struts2.ServletActionContext;

import com.dyj.dao.OperateDao;
import com.dyj.model.PageBean;
import com.dyj.model.Operate;
import com.dyj.util.Conversiongood;
import com.dyj.util.DateUtil;
import com.dyj.util.DbUtil;
import com.dyj.util.ExcelUtil;
import com.dyj.util.FormatStringUtil;
import com.dyj.util.JsonUtil;
import com.dyj.util.ResponseUtil;
import com.dyj.util.ResponseUtil3;
import com.dyj.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;

public class OperateAction extends ActionSupport {
	private String page;
	private String rows;
	private String id;
	private String g_name;
	private String delIds;
	private File userUploadFile;
	private Operate operate;

	public Operate getOperate() {
		return operate;
	}

	public void setOperate(Operate operate) {
		this.operate = operate;
	}

	public File getUserUploadFile() {
		return userUploadFile;
	}

	public void setUserUploadFile(File userUploadFile) {
		this.userUploadFile = userUploadFile;
	}

	public String getDelIds() {
		return delIds;
	}

	public void setDelIds(String delIds) {
		this.delIds = delIds;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	DbUtil dbUtil = new DbUtil();
	OperateDao operatedao = new OperateDao();

	@Override
	public String execute() throws Exception {// 查询
		Connection con = null;
		PageBean pageBean = new PageBean(Integer.parseInt(page),
				Integer.parseInt(rows));
		try {
			if (operate == null) {
				operate = new Operate();
			}
			operate.setGoodname(g_name);
			con = dbUtil.getCon();
			JSONObject result = new JSONObject();
			JSONArray jsonArray = JsonUtil.formatRsToJsonArray(operatedao
					.operateList(con, pageBean, operate));
			int total = operatedao.operateCount(con, operate);
			result.put("rows", jsonArray);
			result.put("total", total);
			ResponseUtil.write(ServletActionContext.getResponse(), result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
