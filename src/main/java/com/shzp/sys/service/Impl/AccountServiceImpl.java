package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.dao.UserDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private UserDao userDao;

	@Override
	public Account findByAcc_name(String acc_name) {
		// TODO Auto-generated method stub
		return accountDao.findByAcc_name(acc_name);
	}

	@Override
	public Map<String, Object> getAccount(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		if(sysFenye.getAccount().getUser_code().length()>0) {
			User user = userDao.findUserByUser_name(sysFenye.getAccount().getUser_code());
			sysFenye.getAccount().setUser_code(user.getUser_code());;
		}
		List<Account> account = accountDao.getAccount(sysFenye);
		Integer accountCount = accountDao.getAccountCount(sysFenye);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", accountCount);
		map.put("data", account);
		return map;
	}
	@Override
	public Integer updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	}

	@Override
	public List<Account> getAccountInfo(String acc_code) {
		// TODO Auto-generated method stub
		List<Account> accountlist = accountDao.getAccountInfo(acc_code);
		System.out.println(accountlist);
		return accountlist;
	}

}
