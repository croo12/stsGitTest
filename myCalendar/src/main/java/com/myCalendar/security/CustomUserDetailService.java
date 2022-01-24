package com.myCalendar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.myCalendar.domain.Table_memberVO;
import com.myCalendar.mapper.Table_memberMapper;
import com.myCalendar.security.domain.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailService implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private Table_memberMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// UserDetails 사용자의 정보와 권한정보등을 담는 타입
		
		Table_memberVO vo = mapper.read(username);
		
		log.warn("mapper : " + vo);
		
		return vo == null ? null:new CustomUser(vo);
	}

}
