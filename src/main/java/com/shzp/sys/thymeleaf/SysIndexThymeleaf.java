package com.shzp.sys.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/system")
public class SysIndexThymeleaf {
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public String test1(Model model) {
		return "system/user";
	}
	@RequestMapping(value = "/test2",method = RequestMethod.GET)
	public String test2(Model model) {
		return "system/test2";
	}
	@RequestMapping(value = "/test3",method = RequestMethod.GET)
	public String test3(Model model) {
		return "system/test3";
	}
	@RequestMapping(value = "/test4",method = RequestMethod.GET)
	public String test4(Model model) {
		return "system/test4";
	}

}
