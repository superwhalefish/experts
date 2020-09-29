package com.shzp.sys.service;

import java.util.List;

public interface RoleModuleService {

	List<String> findModuleCodeByRoleCode(List<String> roles);

}
