package com.qd03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qd03.dao.GoodsDao;


@Controller
public class ShopController {

	@Autowired
	private GoodsDao goodsDao;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/reg")
	public String goodsRegister() {
		
		return "product/goodsReg";
	}
	@RequestMapping("/list")
	public String goodsList(Model model) {
		model.addAttribute("goodsList", goodsDao.selectGoods());
		return "product/goodsList";
	}
}
