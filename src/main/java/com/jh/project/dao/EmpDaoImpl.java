package com.jh.project.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.project.model.Emp;
import com.jh.project.model.Member;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	SqlSession session;
	
	@Override
	public Emp selectEmp(String id) {
		Emp emp = session.selectOne("HGempSelect",id);
		return emp;
	}

	@Override
	public int insertEmp(Member member, String dept) {
		Emp emp = new Emp();
//		emp.setDept(dept);
//		emp.setId(member.getId());
		int result = session.insert("GHempInsert",emp);
		return result;
	}

}
