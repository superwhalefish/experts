package com.shzp.sys.dao;

import java.util.List;

public interface RoleModuleDao {

	List<String> findModuleCodeByRoleCode(List<String> roles);

}
