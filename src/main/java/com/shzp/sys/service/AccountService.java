package com.shzp.sys.service;

import java.util.List;
import java.util.Map;

import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;

public interface AccountService {

	Account findByAcc_name(String acc_name);
	/**
	 * 根据条件查询账号信息
	 * @param fenye
	 * @return
	 */
	Map<String,Object> getAccount(SysFenye sysFenye);
	/**
	 * 动态修改账号信息
	 * @param account
	 * @return
	 */
	Integer updateAccount(Account account);
	/**
	 * 获取账号信息
	 * @param acc_code
	 * @return
	 */
	List<Account> getAccountInfo(String acc_code);
}
