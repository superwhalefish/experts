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

	/**
	 * 根据user_code删除信息
	 * 
	 * @param user_code
	 * @return
	 */
	public Integer delByUsercode(String user_code);
}
