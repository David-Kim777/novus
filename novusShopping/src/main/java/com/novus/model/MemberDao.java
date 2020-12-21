package com.novus.model;

import com.novus.domain.MemberVO;

public interface MemberDao {

	/**
	 * id 중복체트 기능 구현
	 */	
	MemberVO  idCheck( MemberVO vo );
	
	/**
	 * 회원가입기능 구현
	 */
	int memSignup(MemberVO vo);
	
	/**
	 * 로그인 확인 기능 구현
	 */
	MemberVO memLogin(MemberVO vo);

}
