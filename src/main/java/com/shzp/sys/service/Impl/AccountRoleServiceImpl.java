package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.dao.RoleDao;
import com.shzp.sys.entity.AccountRole;
import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.RoleModule;
import com.shzp.sys.service.AccountRoleService;

@Service
public class AccountRoleServiceImpl implements AccountRoleService {
	@Autowired
	private AccountRoleDao accountRoleDao;
	@Autowired
	private RoleDao roleDao;

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

	@Override
	public Map<String, Object> roleToAcc(String acc_code) {
		// TODO Auto-generated method stub
		List<String> role_codes = accountRoleDao.findRoleCodeByAcc_code(acc_code);
		List<Role> rList=roleDao.getRoleAll();
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("role_codes", role_codes);
		map.put("roleAll", rList);
		return map;
	}

	@Override
	public Integer addAccountRole(String acc_code, String role_codes) {
		// TODO Auto-generated method stub
		String[] split = role_codes.split(",");
		List<AccountRole> arList = new LinkedList<AccountRole>();
		for (int i = 1; i < split.length; i++) {
			AccountRole accountRole = new AccountRole();
			accountRole.setAcc_code(acc_code);
			accountRole.setRole_code(split[i]);
			arList.add(accountRole);
		}
		
		return accountRoleDao.addAccountRole(arList);
	}

	@Override
	public Integer delAccountRole(String acc_code, String role_codes) {
		// TODO Auto-generated method stub
		String[] split = role_codes.split(",");
		List<AccountRole> arList = new LinkedList<AccountRole>();
		for (int i = 1; i < split.length; i++) {
			AccountRole accountRole = new AccountRole();
			accountRole.setAcc_code(acc_code);
			accountRole.setRole_code(split[i]);
			arList.add(accountRole);
		}
		
		return accountRoleDao.delAccountRoler(arList);
	}

}
