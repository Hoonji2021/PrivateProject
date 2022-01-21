package com.jh.project.dao;

import com.jh.project.model.Emp;
import com.jh.project.model.Member;

public interface EmpDao {
	Emp selectEmp(String id);

	int insertEmp(Member member, String dept);
}
