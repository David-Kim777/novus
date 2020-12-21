package com.novus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.novus.domain.MemberVO;
import com.novus.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/mem/idCheck.do",produces="application/text;charset=utf-8")
	//****************************************************
	// AJAX
	@ResponseBody  //AJAX라는 의미
	public String idCheck(MemberVO vo) {
		MemberVO result = memberService.idCheck_Login(vo);
		String message="이미 사용중입니다.";
		if(result==null) {
			message="사용가능한 아이디입니다.";
		}
		/**********
		 *  추후에는 보내는 데이터는 Json 구조로 만드시고
		 *  그 Json을 문자열로 변환해서 리턴함
		 */
		return message;
		//**************** 리턴형이 String인 경우 원래는 뷰페이지 지정이여야 하지만
		//                AJAX인 경우는 결과만 반환
	}
	
	
	@RequestMapping("mem/member/memLogin.nv")
	public void login(MemberVO vo, HttpSession session) {
//		MemberVO result = memberService.idCheck_Login(vo);
//		if(result==null || result.getMem_Id() == null) {
//			
//			//로그인 화면 페이지 이동
//		
//		}else {
//			// 세션에 login 이름에 사용자 이름을 저장하기
//			session.setAttribute("login", result.getMem_Name());
//			
//			// user/login_ok.jsp 이동
//			
//		}
	}
}
