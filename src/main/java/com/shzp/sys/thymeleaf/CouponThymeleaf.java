package com.shzp.sys.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/coupon")
public class CouponThymeleaf {

	@RequestMapping(value = "/coupon", method = RequestMethod.GET)
	public String coupon(Model model) {
		return "cou/coupon";
	}
}
