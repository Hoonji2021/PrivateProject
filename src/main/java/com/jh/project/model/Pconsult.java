package com.jh.project.model;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pconsult {
	private String id;
	private int    pnum;
	private Date   pdate;
	private int    pcount;
	private String pcontent;
	private String ptitle;
	private String pw;
	
	//조회용
	private String pageNum;  
	private int    start; 		 
	private int    end;
	private int    adminReplyChk;
}
