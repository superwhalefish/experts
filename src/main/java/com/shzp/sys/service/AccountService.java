package com.shzp.sys.service;

import java.util.List;
import java.util.Map;

import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;

public interface AccountService {
	/**
	 * 账号登录
	 * @param usr
	 * @param psw
	 * @return
	 */
	public String login(String usr, String psw);

	public Account findByAcc_name(String acc_name);
	/**
	 * 根据条件查询账号信息
	 * @param fenye
	 * @return
	 */
	public Map<String,Object> getAccount(SysFenye sysFenye);
	/**
	 * 动态修改账号信息
	 * @param account
	 * @return
	 */
	public Integer updateAccount(Account account);
	/**
	 * 获取账号信息
	 * @param acc_code
	 * @return
	 */
	public List<Account> getAccountInfo(String acc_code);
	/**
	 * 根据账号编码进行删除信息
	 * @param acc_code
	 * @return
	 */
	public Integer delByAcc_code(String acc_code);
}
