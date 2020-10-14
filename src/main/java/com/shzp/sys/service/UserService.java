package com.shzp.sys.service;

import java.util.Map;

import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;

public interface UserService {

	public Integer updateUserByUserCode(User user);

	/**
	 * 获取员工信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	public Map<String, Object> getUser(SysFenye sysFenye);
}
