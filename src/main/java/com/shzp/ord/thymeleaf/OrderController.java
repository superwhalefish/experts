package com.shzp.ord.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ord")
public class OrderController {

	@RequestMapping(value = "/order")
	public String order(Model model) {
		
		return "ord/order";
	}
}
