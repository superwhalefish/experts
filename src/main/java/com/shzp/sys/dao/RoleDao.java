package com.shzp.sys.dao;

import java.util.List;
import java.util.Map;

import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.SysFenye;

public interface RoleDao {
	/**
	 * 动态获取角色信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	List<Role> getRole(SysFenye sysFenye);
	
	/**
	 * 动态获取角色数量信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	Integer getRoleCount(SysFenye sysFenye);

}
