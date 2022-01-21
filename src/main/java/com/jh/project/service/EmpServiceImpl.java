package com.jh.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.project.dao.EmpDao;
import com.jh.project.model.Emp;
import com.jh.project.model.Member;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao empDao;
	
	@Override
	public Emp selectEmp(String id) {
		Emp emp = empDao.selectEmp(id);
		return emp;
	}

	@Override
	public int newEmp(Member member, String dept) {
		int result = empDao.insertEmp(member,dept);
		return result;
	}

}
