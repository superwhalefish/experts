package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.dao.RoleDao;
import com.shzp.sys.dao.RoleModuleDao;
import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.AccountService;
import com.shzp.sys.service.RoleModuleService;
import com.shzp.sys.service.RoleService;
import com.shzp.utils.RandomUtils;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AccountRoleDao accountRoleDao;
	@Autowired
	private RoleModuleDao roleModuleDao;

	@Override
	public Map<String, Object> getRole(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		List<Role> Rlist = roleDao.getRole(sysFenye);
		Integer count = roleDao.getRoleCount(sysFenye);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", count);
		map.put("data", Rlist);
		return map;
	}

	@Override
	public Integer updateRole(Role role) {
		// TODO Auto-generated method stub
		return roleDao.updateRole(role);
	}

	@Override
	public Integer delRoleByRoleCode(String role_code) {
		// TODO Auto-generated method stub
		Integer a = accountRoleDao.findRoleByRoleCount(role_code);
		List<String> moduleCodeByRoleCode = roleModuleDao.getModuleCodeByRoleCode(role_code);
		Integer r = 0;
		if (moduleCodeByRoleCode.size()<=0) {
			r = 20;
			if (a == 0) {
				roleDao.delRoleByRoleCode(role_code);
				r = 1;
			}
		}
		return r;
	}

	@Override
	@Transactional
	public Integer deleteRoleByRoleCode(String role_code) {
		// TODO Auto-generated method stub
		Integer r = 0;
		Integer ar = accountRoleDao.delAccountRoleByRolecode(role_code);
		Integer rm = roleModuleDao.delRoleModuleByRolecode(role_code);

		if (ar > 0 && rm > 0) {
			r = roleDao.delRoleByRoleCode(role_code);
		}
		return r;
	}

	@Override
	public Integer addRole(String role) {
		// TODO Auto-generated method stub
		RandomUtils randomUtils = new RandomUtils();
		Role role2 = new Role();
		String timeRand = randomUtils.getTimeRand();
		role2.setRole(role);
		role2.setRole_code(timeRand);
		Integer r= roleDao.addRole(role2);
		return r;
	}

}
