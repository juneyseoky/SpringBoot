package com.exam.cmd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest req) {
		return "index";
	}
	
//	@RequestMapping("/req")
//	public ModelAndView mtdReq(HttpServletRequest req) {
//		ModelAndView mav = new ModelAndView();
//		String uid = null;
//		String uname = null;
//		
//		try {
//			uid = req.getParameter("uid");
//			uname = req.getParameter("uname");
//			mav.addObject("uid", uid);
//			mav.addObject("uname", uname);
//			
//			mav.setViewName("mtdReq");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return mav;
//	}
	
	@RequestMapping("/req")
	public String mtdReq(
			@RequestParam("uid") String uid, 
			@RequestParam("uname") String uname,
			Model model) {
		model.addAttribute("uid", uid);
		model.addAttribute("uname", uname);
		
		return "mtdReq";
	}
	
	@RequestMapping("/reqCmd")
	public String mtdReqCmd(Member member) {
		return "mtdReq";
	}
}
