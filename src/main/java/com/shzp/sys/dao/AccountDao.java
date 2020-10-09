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
	Account findByAcc_name(String acc_name);

	/**
	 * 多条件查询账号信息
	 * 
	 * @param account
	 * @return
	 */
	List<Account> getAccount(SysFenye sysFenye);

	/**
	 * 统计账号信息
	 * 
	 * @param account
	 * @return
	 */
	Integer getAccountCount(SysFenye sysFenye);

	/**
	 * 修改账号信息
	 * 
	 * @param account
	 * @return
	 */
	Integer updateAccount(Account account);

	/**
	 * 根据acc_code查询账号信息
	 * 
	 * @param acc_code
	 * @return
	 */
	List<Account> getAccountInfo(String acc_code);

}
