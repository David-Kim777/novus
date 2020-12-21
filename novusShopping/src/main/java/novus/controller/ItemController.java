package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	// 惑前 格废
	@RequestMapping("item/ItemList/itemList.nv")
	public void itemList() {
		System.out.println("item/ItemList/itemList.nv 夸没凳");
	}
	
	// 惑前 技何 沥焊
	@RequestMapping("item/ItemInfo/itemDetails.nv")
	public void itemDetailst() {
		System.out.println("item/ItemInfo/itemDetails.nv 夸没凳");
	}
	
	// 惑前 府轰
	@RequestMapping("item/ItemInfo/itemReview.nv")
	public void itemReview() {
		System.out.println("item/ItemInfo/itemReview.nv 夸没凳");
	}
	
	// 惑前 可记
	@RequestMapping("item/ItemInfo/itemDetailOption.nv")
	public void itemDetailOption() {
		System.out.println("item/ItemInfo/itemDetailOption.nv 夸没凳");
	}

}
