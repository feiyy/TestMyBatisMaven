package com.neuedu.model.po;

import java.io.Serializable;

public class Orderdetails implements Serializable{	
	private int id;
	private double price;
	private int pcount;
	private double ptotalprice;
	private Sorder order;
	private Product p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
	public double getPtotalprice() {
		return ptotalprice;
	}
	public void setPtotalprice(double ptotalprice) {
		this.ptotalprice = ptotalprice;
	}
	public Sorder getOrder() {
		return order;
	}
	public void setOrder(Sorder order) {
		this.order = order;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	
	

}
