package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	// ��ǰ ���
	@RequestMapping("item/ItemList/itemList.nv")
	public void itemList() {
		System.out.println("item/ItemList/itemList.nv ��û��");
	}
	
	// ��ǰ ���� ����
	@RequestMapping("item/ItemInfo/itemDetails.nv")
	public void itemDetailst() {
		System.out.println("item/ItemInfo/itemDetails.nv ��û��");
	}
	
	// ��ǰ ����
	@RequestMapping("item/ItemInfo/itemReview.nv")
	public void itemReview() {
		System.out.println("item/ItemInfo/itemReview.nv ��û��");
	}
	
	// ��ǰ �ɼ�
	@RequestMapping("item/ItemInfo/itemDetailOption.nv")
	public void itemDetailOption() {
		System.out.println("item/ItemInfo/itemDetailOption.nv ��û��");
	}

}
