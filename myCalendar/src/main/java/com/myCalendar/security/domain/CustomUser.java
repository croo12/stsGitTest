package com.myCalendar.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.myCalendar.domain.Table_memberVO;

import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
public class CustomUser extends User {
//vo의 객체를 UserDetails 타입으로 변환하는 작업을 처리하고 User 클래스를 상속받아 처리한다
	
	private static final long serialVersionUID = 1L;
	
	private Table_memberVO member;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		//user 클래스를 상속하기 때문에 부모클래스 생성자를 호출
	}
	
	public CustomUser(Table_memberVO vo) {
		super(vo.getUserid(), vo.getUserpw(), vo.getAuthList().stream().map(auth ->
		new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		log.info(vo);
		this.member=vo;
		
		
	}
}
