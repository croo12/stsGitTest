package com.myCalendar.domain;

import java.util.List;

import lombok.Data;

@Data
public class Table_memberVO {

	private String userid;
	private String userpw;
	private String userName;
	private String tel;
	private String email;
	private String enabled;
	
	private List<Table_member_authVO> authList;
}
