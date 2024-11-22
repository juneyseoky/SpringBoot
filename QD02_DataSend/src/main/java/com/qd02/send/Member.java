package com.qd02.send;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Member {

	@RequestMapping("/send")
	public String send() {
		return "/mem/login";
	}
	@RequestMapping("/receive")
	public ModelAndView send(HttpServletRequest req) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("email", req.getParameter("email"));
		mav.addObject("pass", req.getParameter("pass"));
		mav.setViewName("/mem/loginProc");
		return mav;
	}
	
	@RequestMapping("/join")
	public String join() {
		return "/mem/join";
	}
	
	@RequestMapping("/joinProc")
	public String joinProc(@RequestParam("email") String email,
			@RequestParam("pass") String pass,
			@RequestParam(name = "checkVal", required =false) String checkVal,
			Model model) {
		int val = 0;
		if(checkVal.equals("on")) {
			val = 1;
		}
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		model.addAttribute("checkVal", val);
		
		return "/mem/joinProc";
	}
	
	@RequestMapping("/ask")
	public String ask() {
		return "/job/ask";
	}
	
	@RequestMapping("/askProc")
	public String askProc(Bean bean) {
		
		return "/job/askProc";
	}
}
