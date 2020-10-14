package com.shzp.sys.service;

import java.util.Map;

import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.SysFenye;

public interface RoleService {
	/**
	 * 动态获取角色信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	Map<String, Object> getRole(SysFenye sysFenye);

	/**
	 * 修改角色信息
	 * 
	 * @param role
	 * @return
	 */
	Integer updateRole(Role role);

	/**
	 * 删除角色
	 * 
	 * @param role_code
	 * @return
	 */
	Integer delRoleByRoleCode(String role_code);

	/**
	 * 强制删除
	 * 
	 * @param role_code
	 * @return
	 */
	Integer deleteRoleByRoleCode(String role_code);

	/**
	 * 添加角色
	 * 
	 * @param role
	 * @return
	 */
	Integer addRole(String role);

}
