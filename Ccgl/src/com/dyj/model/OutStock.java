package com.dyj.model;

import java.util.Date;

public class OutStock {
	private int outstockid;
	private int goodid;
	private double saleprice;
	private Date outstockdate;
	private int outstocknumber;
	private int outstocknumberold;
	private int storageid;

	private String outstocknote;
	private String goodname;

	public int getStorageid() {
		return storageid;
	}

	public void setStorageid(int storageid) {
		this.storageid = storageid;
	}

	public int getOutstocknumberold() {
		return outstocknumberold;
	}

	public void setOutstocknumberold(int outstocknumberold) {
		this.outstocknumberold = outstocknumberold;
	}

	public String getGoodname() {
		return goodname;
	}

	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}

	public int getOutstockid() {
		return outstockid;
	}

	public void setOutstockid(int outstockid) {
		this.outstockid = outstockid;
	}

	public int getGoodid() {
		return goodid;
	}

	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	public Date getOutstockdate() {
		return outstockdate;
	}

	public void setOutstockdate(Date outstockdate) {
		this.outstockdate = outstockdate;
	}

	public int getOutstocknumber() {
		return outstocknumber;
	}

	public void setOutstocknumber(int outstocknumber) {
		this.outstocknumber = outstocknumber;
	}

	public String getOutstocknote() {
		return outstocknote;
	}

	public void setOutstocknote(String outstocknote) {
		this.outstocknote = outstocknote;
	}

}
