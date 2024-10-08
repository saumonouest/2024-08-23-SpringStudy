package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// 화면 제어 => 화면만 변겅 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@GetMapping("board/list.do")
	public String board_list() {
		return "board/list";
	}
	@GetMapping("board/insert.do")
	public String board_insert() {
		return "board/insert";
	}
	
	@GetMapping("board/detail.do")
	public String board_detail(int no, Model model) {
		model.addAttribute("no",no);
		return "board/detail";
	}
	
	@GetMapping("board/update.do")
	public String board_update(int no, Model model) {
		model.addAttribute("no", no);
		return "board/update";
	}
}















