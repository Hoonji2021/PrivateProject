package com.jh.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainControllerJH {
	
	@RequestMapping(value = "main", method = {RequestMethod.POST, RequestMethod.GET})
	public String main(HttpServletRequest request, Model model) {
		System.out.println("MainControllerJH start...");
		
		HttpSession session = null;
		session = request.getSession();
		System.out.println("request.getParameter(id)->"+request.getParameter("id"));
		System.out.println("request.getParameter(state)->"+request.getParameter("state"));
		System.out.println("request.getParameter(name)->"+request.getParameter("name"));
		
		if(request.getParameter("id") != null) {
			session.setAttribute("sessionId", request.getParameter("id"));
			session.setAttribute("sessionState", request.getParameter("state"));
			session.setAttribute("sessionName", request.getParameter("name"));
			session.setAttribute("sessionEmpno", request.getParameter("empno"));
			session.setAttribute("sessionDept", request.getParameter("dept"));
		}
		
		model.addAttribute("sessionId", session.getAttribute("sessionId"));
		model.addAttribute("sessionState", session.getAttribute("sessionState"));
		model.addAttribute("sessionName", session.getAttribute("sessionName"));
		model.addAttribute("sessionEmpno", session.getAttribute("sessionEmpno"));
		model.addAttribute("sessionDept", session.getAttribute("sessionDept"));
		
		return "main";
	}
	
	
}
