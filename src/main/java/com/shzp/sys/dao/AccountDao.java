package com.shzp.sys.dao;

import java.util.List;

import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;

public interface AccountDao {
	/**
	 * 根据账号查询信息
	 * 
	 * @param acc_name 账号
	 * @return 账号信息
	 */
	public Account findByAcc_name(String acc_name);

	/**
	 * 多条件查询账号信息
	 * 
	 * @param account
	 * @return
	 */
	public List<Account> getAccount(SysFenye sysFenye);

	/**
	 * 统计账号信息
	 * 
	 * @param account
	 * @return
	 */
	public Integer getAccountCount(SysFenye sysFenye);

	/**
	 * 修改账号信息
	 * 
	 * @param account
	 * @return
	 */
	public Integer updateAccount(Account account);

	/**
	 * 根据acc_code查询账号信息
	 * 
	 * @param acc_code
	 * @return
	 */
	public List<Account> getAccountInfo(String acc_code);

	/**
	 * 根据账号删除相关信息
	 * 
	 * @param acc_code
	 * @return
	 */
	public Integer delByAcc_code(String acc_code);

	/**
	 * 根据账号acc_code查取账号信息
	 * @param acc_code
	 * @return
	 */
	public Account findByAcc_code(String acc_code);

}
