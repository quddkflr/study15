package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//http://localhost:8089/myhome/index
	@GetMapping("/index")
	public String hello1() {
		return "NewFile3";
	}
	
	@GetMapping("/index2")
	public String hello2() {
		return "NewFile4";
	}
	
	@GetMapping("/index3")
	public String hello3() {
		return "NewFile5";
	}
}
