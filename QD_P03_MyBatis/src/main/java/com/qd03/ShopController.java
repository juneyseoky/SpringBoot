package com.qd03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qd03.dao.GoodsDao;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class ShopController {

	@Autowired
	private GoodsDao goodsDao;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/reg")
	public String goodsReg() {
		
		return "product/goodsReg";
	}
	@RequestMapping("/list")
	public String goodsList(Model model) {
		model.addAttribute("goodsList", goodsDao.selectGoods());
		return "product/goodsList";
	}
	
	@RequestMapping("/goodsRegister")
	public String goodsRegister(HttpServletRequest req) {
		Map<String, String> map = new HashMap<>();
		String price = req.getParameter("price");
		if(price == null || price.isEmpty()) {
			price = "0";
		}
		map.put("goodsCode", req.getParameter("goodsCode"));
		map.put("goodsName", req.getParameter("goodsName"));
		map.put("price", price);
		map.put("cnt", req.getParameter("cnt"));
		
		goodsDao.goodsReg(map);
		
		return "redirect:list";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", goodsDao.searchGoods(req.getParameter("searchKeyword")));
		mav.setViewName("product/goodsList");
		
		return mav;
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("nums") List<String> list) {
		System.out.println(list);
		goodsDao.deleteGoods(list);
//		for(int i=0; i<list.size(); i++) {
//			String num = list.get(i);
//		}
		return "product/goodsList";
	}
}
