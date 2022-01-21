package com.jh.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.project.model.Member;

@Repository
public class LoginDaoImpl implements LoginDao {
	// JDBC = DataSource, JPA = EntityManager, MyBatis = SqlSession
	@Autowired
	private SqlSession session;

	public List<Member> getIdPw(String id) {//요기로 id가 들어온다..
		System.out.println("LoginDaoImpl getIdPw() start...");

		List<Member> data = null;
		try {
			data = session.selectList("ksGetIdPw", id);
			System.out.println("data ->"+data);
			
			System.out.println("state!!!!!!!!!!!!!!!!!!!!!!->"+data.get(0).getState());
			System.out.println("name!!!!!!!!!!!!!!!!!!!!!!!->"+data.get(0).getName());
		} catch (Exception e) {
			System.out.println("LoginDaoImpl getIdPw() Error ->>>>> " + e.getMessage());
		}
		return data;
	}

}
