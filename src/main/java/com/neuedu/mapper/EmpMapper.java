package com.neuedu.mapper;

import java.util.List;

import com.neuedu.model.po.Dept;
import com.neuedu.model.po.Emp;

public interface EmpMapper {
	
	public List<Emp> getAllEmps();
	
	public List<Dept> getAllDepts();

}
