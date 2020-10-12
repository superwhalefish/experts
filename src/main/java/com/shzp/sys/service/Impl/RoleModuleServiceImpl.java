package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.ModuleDao;
import com.shzp.sys.dao.RoleModuleDao;
import com.shzp.sys.entity.Module;
import com.shzp.sys.entity.RoleModule;
import com.shzp.sys.service.RoleModuleService;

@Service
public class RoleModuleServiceImpl implements RoleModuleService {
	@Autowired
	private RoleModuleDao roleModuleDao;
	@Autowired
	private ModuleDao moduleDao;

	@Override
	public List<String> findModuleCodeByRoleCode(List<String> roles) {
		// TODO Auto-generated method stub
		return roleModuleDao.findModuleCodeByRoleCode(roles);
	}

	@Override
	public Map<String, Object> getRoleModule(String role_code) {
		// TODO Auto-generated method stub
		List<Module> moduleAll = moduleDao.findModuleAll();
		// roleModuleDao.findModuleCodeByRoleCode(roles);
		List<String> rList = roleModuleDao.getModuleCodeByRoleCode(role_code);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("moduleAll", moduleAll);
		map.put("role", rList);
		return map;
	}

	@Override
	public Integer addRoleModule(String role_code, String module_codes) {
		// TODO Auto-generated method stub
		String[] split = module_codes.split(",");
		List<RoleModule> rmList = new LinkedList<RoleModule>();
		for (int i = 1; i < split.length; i++) {
			RoleModule roleModule = new RoleModule();
			roleModule.setModule_code(split[i]);
			roleModule.setRole_code(role_code);
			rmList.add(roleModule);
		}
		return roleModuleDao.addRoleModule(rmList);
	}

	@Override
	public Integer delRoleModule(String role_code, String module_codes) {
		// TODO Auto-generated method stub
		String[] split = module_codes.split(",");
		List<RoleModule> rmList = new LinkedList<RoleModule>();
		for (int i = 1; i < split.length; i++) {
			RoleModule roleModule = new RoleModule();
			roleModule.setModule_code(split[i]);
			roleModule.setRole_code(role_code);
			rmList.add(roleModule);
		}
		return roleModuleDao.delRoleModule(rmList);
	}

}
