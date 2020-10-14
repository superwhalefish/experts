package com.shzp.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.service.AccountRoleService;

@Controller
@RequestMapping(value = "/accountRole")
public class AccountRoleController {

	@Autowired
	private AccountRoleService accountRoleService;

	@RequestMapping(value = "/roleToAcc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> roleToAcc(String acc_code) {

		return accountRoleService.roleToAcc(acc_code);
	}

	@RequestMapping(value = "/addAccountRole", method = RequestMethod.POST)
	@ResponseBody
	private Integer addAccountRole(String acc_code, String role_codes) {
		return accountRoleService.addAccountRole(acc_code, role_codes);
	}
	@RequestMapping(value = "/delAccountRole", method = RequestMethod.POST)
	@ResponseBody
	private Integer delAccountRole(String acc_code, String role_codes) {
		return accountRoleService.delAccountRole(acc_code, role_codes);
	}
	
}
