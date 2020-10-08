package com.shzp.product.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/proinfo")
public class ProductThymeleaf {
	@RequestMapping(value = "proinfo",method =RequestMethod.POST)
	public String Product() {
		
		return "proinfo";
	}
}
