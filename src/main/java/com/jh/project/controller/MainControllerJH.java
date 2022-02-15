package com.jh.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jh.project.model.Pconsult;
import com.jh.project.service.Paging;
import com.jh.project.service.Pconsult_Ser;

@Controller
public class MainControllerJH {
	
	@Autowired
	private Pconsult_Ser pservice;
	
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
	
	@GetMapping(value = "pconsult")
	public String PconsultList(Model model, String currentPage,Pconsult pconsult) {
		System.out.println("MainControllerJH pconsult start..");
		
		//게시물 총 개수
		int totalCnt = pservice.pconsultTotal();
		System.out.println("MainControllerJH PconsultList total->"+totalCnt);
		
		//페이징
		System.out.println("MainControllerJH currentPage->"+currentPage);
		Paging pg = new Paging(totalCnt, currentPage);
				
		pconsult.setStart(pg.getStart());
		pconsult.setEnd(pg.getEnd());
		
		//pconsult의 모든 데이터 가지고 오기
		List<Pconsult> pconsult_List = pservice.pconsultAll(pconsult);
		System.out.println("MainControllerJH pconsult_List id->"+pconsult_List.get(0).getId());
		
		
	
		
		model.addAttribute("pList", pconsult_List);
		model.addAttribute("pg", pg);
		return "pconsult";
	}
	
	@GetMapping(value = "pconsultInsertForm")
	public String pConsultInsert(Model model) {
		System.out.println("MainControllerJH pConsultInsert start...");
		return "pconsultInsertForm";
	}
	
	@PostMapping(value = "pconsultInsertPro")
	public String pConsultInsertPro(Model model, Pconsult pconsult) {
		System.out.println("MainControllerJH pConsultInsertPro start...");
		// db에 pconsult 내용 저장
		pservice.pconsultInsert(pconsult);
		return "pconsultInsertPro";
	}
	
}
