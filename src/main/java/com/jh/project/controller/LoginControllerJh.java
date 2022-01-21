package com.jh.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jh.project.model.Emp;
import com.jh.project.model.Member;
import com.jh.project.service.EmpService;
import com.jh.project.service.LoginService;

@Controller
public class LoginControllerJh {
	
	@Autowired
	private LoginService ls;
	@Autowired
	private EmpService es;
	
	@GetMapping(value = "login")
	public String loginPage() {
		System.out.println("LoginController loginPage() start...");
		return "login";
	}
	
	@PostMapping(value = "loginDo")
	@ResponseBody
	public List<Member> loginDo(String id){
		System.out.println("LoginController loginDo() start...");
		List<Member> data = ls.getIdPw(id); // id,pw,state만
		
		// by지훈 / member.state = 2이면 직원, 4이면 관리자
		if(data.get(0).getState() == 2 || data.get(0).getState() == 4) {
			Emp emp = es.selectEmp(id);
			//by지훈 / data에는 member.id,pw,state와 name,empno,dept(히든데이터)가 더 있다.
			data.get(0).setEmpno(emp.getEmpno());
			data.get(0).setDept(emp.getDept());
			
		}
		
		System.out.println("data ->"+data);
		
		return data;
	}
}
