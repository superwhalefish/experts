package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.RoleDao;
import com.shzp.sys.entity.Role;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

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

}
