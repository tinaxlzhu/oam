package com.dyj.model;

import java.util.Date;
/**
 * CREATE TABLE `t_operate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL COMMENT '操作员',
  `operatetime` date DEFAULT NULL COMMENT '操作时间',
  `operateType` int(11) DEFAULT NULL COMMENT '操作类型1:入库，2:出库',
  `remark` char(1) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8;

 */
public class Operate {
	private int id;
	private int userid;
	private int goodid;
	private Date operatetime;
	private int operateType;
	private String remark;
	
	private String goodname;
	
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getOperatetime() {
		return operatetime;
	}
	public void setOperatetime(Date operatetime) {
		this.operatetime = operatetime;
	}
	public int getOperateType() {
		return operateType;
	}
	public void setOperateType(int operateType) {
		this.operateType = operateType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
