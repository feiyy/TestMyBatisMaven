package com.neuedu.model.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Userinfo implements Serializable{	
	private int id;
	private String name;
	private String sex;
	private Timestamp birthday;
	private double sal;
	private List<Sorder> orders;
		
	public List<Sorder> getOrders() {
		return orders;
	}
	public void setOrders(List<Sorder> orders) {
		this.orders = orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
