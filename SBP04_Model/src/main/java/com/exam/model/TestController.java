package com.exam.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("test")
	public String test(Model model) {
		model.addAttribute("name", "test1");
		
		return "test1";
	}

	@RequestMapping("/mv")
	public ModelAndView test2() {
		ModelAndView mav = new ModelAndView();
		
		List<String> objList = new ArrayList<>();

		objList.add("딸기");
		objList.add("귤");
		objList.add("수박");
		
		mav.addObject("lists", objList);
		mav.addObject("ObjectTest", "점검용 텍스트");
		
		mav.addObject("name", "복숭아");
		mav.setViewName("subDir/sampleView");
		
		
		return mav;
	}
}
