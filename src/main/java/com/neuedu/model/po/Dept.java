package com.neuedu.model.po;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
	
	private int deptno;
	private String dname;
	private List<Emp> emps;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

}
