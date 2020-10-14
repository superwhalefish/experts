package com.shzp.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private SysFenye sysFenye;
	
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getUser(Integer page, Integer limit,User user) {
		sysFenye.setPage((page-1)*limit);
		sysFenye.setLimit(limit);
		sysFenye.setUser(user);
		return userService.getUser(sysFenye);

	}
}
