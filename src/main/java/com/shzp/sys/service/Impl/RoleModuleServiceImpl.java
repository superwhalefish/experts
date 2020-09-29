package com.shzp.sys.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.RoleModuleDao;
import com.shzp.sys.service.RoleModuleService;
@Service
public class RoleModuleServiceImpl implements RoleModuleService {
@Autowired
	private RoleModuleDao roleModuleDao;
	@Override
	public List<String> findModuleCodeByRoleCode(List<String> roles) {
		// TODO Auto-generated method stub
		return roleModuleDao.findModuleCodeByRoleCode(roles);
	}

}
