package com.myCalendar.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SampleDTO {

	private String name;
	private int age;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birth;
}
