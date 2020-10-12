package com.shzp.product.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/proinfo")
public class ProductThymeleaf {
	@RequestMapping(value = "/proinfo",method =RequestMethod.GET)
	public String Product(Model model) {
		System.out.println("proinfo-----------------------------");
		return "pro/proinfo";
	}
	@RequestMapping(value = "/intupd",method =RequestMethod.GET)//别名
	public String Intupd(Model model) {
		System.out.println("intupd-----------------------------");
		return "pro/intupd";//路径
	}
}
