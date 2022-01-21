package com.jh.project.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Replys {
	private String id;			
	private int empno;
	private int pnum;
	private int replynum;
	private String reply;
	private Date replydate;
}
