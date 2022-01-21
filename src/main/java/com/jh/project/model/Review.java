package com.jh.project.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
	private String id;
	private int    rnum;
	private String rtitle;
	private String rcontent;
	private Date   rdate;
	private int    star;
	
	//조회용
	private String pageNum;
	private int start;
	private int end;
}
