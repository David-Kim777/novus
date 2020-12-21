package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliveryController {
	
	// �ֹ� ����
	@RequestMapping("mem/myOrder/myOrder.nv")
	public void myOrder() {
		System.out.println("/mem/myOrder/myOrder.nv ��û��");
	}
	
	// �����ȸ �˾�
	@RequestMapping("mem/myOrder/myDelivery.nv")
	public void myDelivery() {
		System.out.println("/mem/myOrder/myDelivery.nv ��û��");
	}
	
	// ��ȯ/��ǰ
	@RequestMapping("mem/myOrder/myExchange.nv")
	public void myExchange() {
		System.out.println("/mem/myOrder/myExchange.nv ��û��");
	}
	
	// ���� �ۼ�
	@RequestMapping("mem/myOrder/myReview.nv")
	public void myReview() {
		System.out.println("/mem/myOrder/myReview.nv ��û��");
	}

}
