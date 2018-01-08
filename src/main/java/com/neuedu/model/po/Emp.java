package com.neuedu.model.po;

import java.io.Serializable;

public class Emp implements Serializable{
	
	private int empno;
	private String ename;
	private Dept d;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	
	

}
