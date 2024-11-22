package com.exam.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.board.dao.BoardDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

	@Autowired
	private BoardDao boardDao;

	@RequestMapping("/")
	public String root() throws Exception {
		return "redirect:boardList";
	}

	@RequestMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList", boardDao.mtdBoardList());
		return "boardList";
	}

	@RequestMapping("/boardView")
	public String boardView(HttpServletRequest req, Model model) {
		try {
			req.setCharacterEncoding("UTF-8");
			int num = Integer.parseInt(req.getParameter("num"));
			model.addAttribute("mtdBoardView", boardDao.mtdBoardView(num));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "boardView";
	}

	// 게시판 목록 보기
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}

	// 게시판 글 쓰기
	@RequestMapping("/boardWrite")
	public String boardWrite(HttpServletRequest req, Model model) {
		try {
			req.setCharacterEncoding("UTF-8");
			Map<String, String> map = new HashMap<>();
			String writer = req.getParameter("writer");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			map.put("writer", writer);
			map.put("title", title);
			map.put("content", content);
			boardDao.mtdBoardWriter(map);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		return "redirect:boardList";
	}
	// 게시판 글 삭제
	@RequestMapping("/boarDelete")
	public String boardDelete(HttpServletRequest req, Model model) {

		int num = Integer.parseInt(req.getParameter("num"));
		boardDao.mtdBoardDelete(num);

		return "redirect:boardList";
	}
}
