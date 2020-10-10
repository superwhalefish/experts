package com.shzp.sys.service.Impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.service.AccountRoleService;

@Service
public class AccountRoleServiceImpl implements AccountRoleService {
	@Autowired
	private AccountRoleDao accountRoleDao;

	@Override
	public List<String> findRoleByAcc_code(String acc_code) {
		// TODO Auto-generated method stub
		return accountRoleDao.findRoleByAcc_code(acc_code);
	}

	@Override
	@Async
	public Integer delRole_codeByAcc_code(String acc_code) {
		// TODO Auto-generated method stub
		return accountRoleDao.delRole_codeByAcc_code(acc_code);
	}

}
