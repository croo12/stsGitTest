package com.myCalendar.domain;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeVO {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date wdate;
	private int viewcount;
}
