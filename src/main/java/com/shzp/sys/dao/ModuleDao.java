package com.shzp.sys.dao;

import java.util.List;

import com.shzp.sys.entity.Module;

public interface ModuleDao {

	List<Module> findModuleAll();
	/**
	 * 角色对应的模块
	 * @return
	 */
	List<Module> serachModule(List<String> list);
}
