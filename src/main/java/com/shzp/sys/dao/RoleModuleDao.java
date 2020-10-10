package com.shzp.sys.dao;

import java.util.List;

public interface RoleModuleDao {

	public List<String> findModuleCodeByRoleCode(List<String> roles);

}
