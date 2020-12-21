package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliveryController {
	
	// 주문 내역
	@RequestMapping("mem/myOrder/myOrder.nv")
	public void myOrder() {
		System.out.println("/mem/myOrder/myOrder.nv 요청됨");
	}
	
	// 배송조회 팝업
	@RequestMapping("mem/myOrder/myDelivery.nv")
	public void myDelivery() {
		System.out.println("/mem/myOrder/myDelivery.nv 요청됨");
	}
	
	// 교환/반품
	@RequestMapping("mem/myOrder/myExchange.nv")
	public void myExchange() {
		System.out.println("/mem/myOrder/myExchange.nv 요청됨");
	}
	
	// 리뷰 작성
	@RequestMapping("mem/myOrder/myReview.nv")
	public void myReview() {
		System.out.println("/mem/myOrder/myReview.nv 요청됨");
	}

}
