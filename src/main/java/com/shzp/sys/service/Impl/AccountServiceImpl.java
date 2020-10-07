package com.shzp.sys.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
@Autowired
	private AccountDao accountDao;
	@Override
	public Account findByAcc_name(String acc_name) {
		// TODO Auto-generated method stub
		return accountDao.findByAcc_name(acc_name);
	}

}
