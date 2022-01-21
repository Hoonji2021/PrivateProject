package com.jh.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.project.dao.LoginDao;
import com.jh.project.model.Member;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao ld;
	
	@Override
	public List<Member> getIdPw(String id) {
		System.out.println("LoginServiceImplJh getIdPw() start");
		Member member = new Member();
		
		return ld.getIdPw(id);
	}

}
