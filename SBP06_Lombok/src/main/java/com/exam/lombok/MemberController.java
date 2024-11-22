package com.exam.lombok;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/reqCmd")
	public String mtdReqCmd(Goods goods, Model model) {
		
		return "dataPrn";
	}
}
