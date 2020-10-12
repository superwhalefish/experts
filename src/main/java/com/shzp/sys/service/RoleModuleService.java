package com.shzp.sys.service;

import java.util.List;
import java.util.Map;

public interface RoleModuleService {

	public List<String> findModuleCodeByRoleCode(List<String> roles);

	/**
	 * 查取所负责的模块
	 * 
	 * @param role_code
	 * @return
	 */
	public Map<String, Object> getRoleModule(String role_code);

	/**
	 * 添加权限
	 * 
	 * @param role_code
	 * @param module_codes
	 * @return
	 */
	public Integer addRoleModule(String role_code, String module_codes);

	/**
	 * 撤销权限
	 * 
	 * @param role_code
	 * @param module_codes
	 * @return
	 */

	public Integer delRoleModule(String role_code, String module_codes);

}
