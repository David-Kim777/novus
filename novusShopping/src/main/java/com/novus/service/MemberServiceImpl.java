package com.novus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novus.domain.MemberVO;
import com.novus.model.MemberDaoImpl;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	 @Autowired
	 private MemberDaoImpl memberDAO;
	 
		/**
	  * 아이디 중복 체크하는 sql + 로그인 기능 sql
	  */
	  public MemberVO idCheck_Login(MemberVO vo)
	  {
		  return memberDAO.idCheck(vo);
	  }
	  
	  
	  /**
	   * 회원가입 sql
	   */
	   public int memSignup(MemberVO vo)
	   {
		  return memberDAO.memSignup(vo);
	   }
}
