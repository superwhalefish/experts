package com.shzp.sys.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shzp.sys.dao.AccountDao;

@Controller
@RequestMapping(value = "/usr")
public class UsrThymeleaf {
	@Autowired
	private AccountDao accountDao;

	@RequestMapping(value="/user",method = RequestMethod.GET)
	public String index() {
		return "/usr/user";
	}


}
