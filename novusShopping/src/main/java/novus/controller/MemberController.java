package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	// 회원 로그인
	@RequestMapping("mem/member/memLogin.nv")
	public void memLogin() {
		System.out.println("mem/member/memLogin.nv 요청됨");
	}
	
	// 회원가입
	@RequestMapping("mem/member/memSignup.nv")
	public void memSignup() {
		System.out.println("mem/member/memSignup.nv 요청됨");
	}
	
	// 아이디 찾기
	@RequestMapping("mem/member/memIdsearch.nv")
	public void memIdsearch() {
		System.out.println("mem/member/memIdsearch.nv 요청됨");
	}
	
	// 비밀번호 찾기
	@RequestMapping("mem/member/memPassSearch.nv")
	public void memPassSearch() {
		System.out.println("mem/member/memPassSearch.nv 요청됨");
	}
	
	// 마이페이지
	@RequestMapping("mem/myPage/myPage.nv")
	public void myPage() {
		System.out.println("mem/myPage/myPage.nv 요청됨");
	}

}
