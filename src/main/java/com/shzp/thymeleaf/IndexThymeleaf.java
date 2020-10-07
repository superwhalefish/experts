package com.shzp.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexThymeleaf {

	@RequestMapping("/menu")
	public String login() {
		
		return "menu";
	}
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	@RequestMapping("/noAuth")
	public String noAuth() {
		return "noAuth";
		
	}
}
