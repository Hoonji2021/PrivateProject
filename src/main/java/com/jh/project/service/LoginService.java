package com.jh.project.service;

import java.util.List;

import com.jh.project.model.Member;

public interface LoginService {
	List<Member> getIdPw(String id);
}
