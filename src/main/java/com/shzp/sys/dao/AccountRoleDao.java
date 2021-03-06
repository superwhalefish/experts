package com.shzp.sys.dao;

import java.util.List;
import java.util.Set;

import com.shzp.sys.entity.AccountRole;

public interface AccountRoleDao {
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
	 * 判断该角色绑定几个账号
	 * 
	 * @param role_code
	 * @return
	 */
	public Integer findRoleByRoleCount(String role_code);

	/**
	 * 根据角色编号
	 * 
	 * @param role_code
	 * @return
	 */
	public Integer delAccountRoleByRolecode(String role_code);

	/**
	 * 根据acc_code查询role_code
	 * 
	 * @param acc_code
	 * @return
	 */
	public List<String> findRoleCodeByAcc_code(String acc_code);

	/**
	 * 赋予账号权限
	 * 
	 * @param arList
	 * @return
	 */
	public Integer addAccountRole(List<AccountRole> arList);

	/**
	 * 撤销权限
	 * 
	 * @param arList
	 * @return
	 */
	public Integer delAccountRoler(List<AccountRole> arList);

}
