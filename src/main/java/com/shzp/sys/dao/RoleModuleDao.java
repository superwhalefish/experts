package com.shzp.sys.dao;

import java.util.List;

import com.shzp.sys.entity.RoleModule;

public interface RoleModuleDao {

	public List<String> findModuleCodeByRoleCode(List<String> roles);

	/**
	 * 查询该角色所负责权限
	 * 
	 * @param role_code
	 * @return
	 */
	public List<String> getModuleCodeByRoleCode(String role_code);

	/**
	 * 赋予权限
	 * 
	 * @param rmList
	 * @return
	 */
	public Integer addRoleModule(List<RoleModule> rmList);

	/**
	 * 撤销权限
	 * 
	 * @param rmList
	 */
	public Integer delRoleModule(List<RoleModule> rmList);

	/**
	 * 通过role_code删除相关信息
	 * 
	 * @param role_code
	 * @return
	 */
	public Integer delRoleModuleByRolecode(String role_code);

}
