package com.shzp.sys.service;

import java.util.Map;

import com.shzp.sys.entity.SysFenye;

public interface RoleService {
	/**
	 * 动态获取角色信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	Map<String, Object> getRole(SysFenye sysFenye);

}
