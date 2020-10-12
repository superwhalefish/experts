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
	public List<Role> getRole(SysFenye sysFenye);

	/**
	 * 动态获取角色数量信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	public Integer getRoleCount(SysFenye sysFenye);

	/**
	 * 
	 * @param role
	 * @return
	 */
	public Integer updateRole(Role role);

	/**
	 * 根据角色编号删除角色
	 * 
	 * @param role_code
	 * @return
	 */
	public Integer delRoleByRoleCode(String role_code);

}
