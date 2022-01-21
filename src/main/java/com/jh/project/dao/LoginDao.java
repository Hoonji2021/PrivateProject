package com.jh.project.dao;

import java.util.List;

import com.jh.project.model.Member;

public interface LoginDao {
	List<Member> getIdPw(String id);
}
