package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliveryController {
	
	@RequestMapping("mem/myOrder/myOrder.nv")
	public void gomyorder() {
		System.out.println("/mem/myOrder/myOrder.nv ø‰√ªµ ");
	}

}
