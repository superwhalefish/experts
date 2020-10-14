package com.shzp.sys.service;

import java.util.List;
import java.util.Map;

public interface AccountRoleService {
	/**
	 * 根据账号编号查询相应角色
	 * 
	 * @param acc_code
	 * @return
	 */
	public List<String> findRoleByAcc_code(String acc_code);

	/**
	 * 根据账号编号删除相应的角色
	 * 
	 * @param acc_code
	 * @return
	 */
	public Integer delRole_codeByAcc_code(String acc_code);

	/**
	 * 设置账号权限
	 * 
	 * @param acc_code
	 * @return
	 */
	public Map<String, Object> roleToAcc(String acc_code);

	/**
	 * 对帐号添加角色
	 * 
	 * @param acc_code
	 * @param role_codes
	 * @return
	 */
	public Integer addAccountRole(String acc_code, String role_codes);

	/**
	 * 撤销该账号权限
	 * 
	 * @param acc_code
	 * @param role_codes
	 * @return
	 */
	public Integer delAccountRole(String acc_code, String role_codes);

}
