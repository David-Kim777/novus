package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	// ȸ�� �α���
	@RequestMapping("mem/member/memLogin.nv")
	public void memLogin() {
		System.out.println("mem/member/memLogin.nv ��û��");
	}
	
	// ȸ������
	@RequestMapping("mem/member/memSignup.nv")
	public void memSignup() {
		System.out.println("mem/member/memSignup.nv ��û��");
	}
	
	// ���̵� ã��
	@RequestMapping("mem/member/memIdsearch.nv")
	public void memIdsearch() {
		System.out.println("mem/member/memIdsearch.nv ��û��");
	}
	
	// ��й�ȣ ã��
	@RequestMapping("mem/member/memPassSearch.nv")
	public void memPassSearch() {
		System.out.println("mem/member/memPassSearch.nv ��û��");
	}
	
	// ����������
	@RequestMapping("mem/myPage/myPage.nv")
	public void myPage() {
		System.out.println("mem/myPage/myPage.nv ��û��");
	}

}
