package com.neuedu.model.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
/**
 * 
 * 一对一映射（多对一映射）
 *
 */
public class Sorder implements Serializable{	
	private int oid;
	private Timestamp odate;
	private String ostatus;
	private String oaddress;
	private double totalprice;
	private Userinfo u;
	private List<Orderdetails> details;

	public List<Orderdetails> getDetails() {
		return details;
	}
	public void setDetails(List<Orderdetails> details) {
		this.details = details;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Timestamp getOdate() {
		return odate;
	}
	public void setOdate(Timestamp odate) {
		this.odate = odate;
	}
	public String getOstatus() {
		return ostatus;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public Userinfo getU() {
		return u;
	}
	public void setU(Userinfo u) {
		this.u = u;
	}
	
	

}
