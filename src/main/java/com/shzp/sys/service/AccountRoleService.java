package com.shzp.sys.service;

import java.util.List;

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

}
