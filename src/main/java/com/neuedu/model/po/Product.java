package com.neuedu.model.po;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable{	
	private int pid;
	private String pname;
	private String pdesc;
	private double price;
	private List<Orderdetails> details;
	
	public List<Orderdetails> getDetails() {
		return details;
	}
	public void setDetails(List<Orderdetails> details) {
		this.details = details;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
