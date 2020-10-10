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
		System.out.println("success----------------------------------------");
		return "pro/proinfo";
	}
}
