package com.jh.project.service;

import com.jh.project.model.Emp;
import com.jh.project.model.Member;

public interface EmpService {
	//Emp selectEmp(String id);
	Emp selectEmp(String id);
	int newEmp(Member member, String parameter);
}
