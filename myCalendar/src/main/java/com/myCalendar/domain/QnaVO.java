package com.myCalendar.domain;

import java.util.Date;

import lombok.Data;

@Data
public class QnaVO {

	private int qbno;
	private String title;
	private String qcontent;
	private int status;
	private String writer;
	private Date wdate;
	private int viewcount;
	
	private int bno;
	private String acontent;
}
