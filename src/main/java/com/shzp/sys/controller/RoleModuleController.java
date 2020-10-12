package com.shzp.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.service.RoleModuleService;

@Controller
@RequestMapping(value = "/roleModule")
public class RoleModuleController {

	@Autowired
	private RoleModuleService roleModuleService;

	@RequestMapping(value = "/getRoleModule", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getRoleModule(String role_code) {
		return roleModuleService.getRoleModule(role_code);
	}
	
	@RequestMapping(value = "addRoleModule",method = RequestMethod.POST)
	@ResponseBody
	public Integer addRoleModule(String role_code,String module_codes) {
		return roleModuleService.addRoleModule(role_code,module_codes);
	}
	
	@RequestMapping(value = "delRoleModule",method = RequestMethod.POST)
	@ResponseBody
	public Integer delRoleModule(String role_code,String module_codes) {
		return roleModuleService.delRoleModule(role_code,module_codes);
	}
}
