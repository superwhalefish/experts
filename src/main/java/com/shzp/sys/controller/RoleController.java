package com.shzp.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.RoleService;

@Controller
@RequestMapping(value = "/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private SysFenye sysFenye;
	
	@RequestMapping(value = "/getRole",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAccount(Integer page, Integer limit, Role role) {
		sysFenye.setPage((page-1)*limit);
		sysFenye.setLimit(limit);
		sysFenye.setRole(role);
		return roleService.getRole(sysFenye);
	}
}
