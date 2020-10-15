package com.shzp.sys.dao;

import java.util.List;

import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;

public interface UserDao {
	/**
	 * 根据用户编号查询用户信息
	 * 
	 * @param user_code 用户编码
	 * @return 用户信息
	 */
	public User findUserByUser_code(String user_code);

	/**
	 * 根据用户编号查询用户名称
	 * 
	 * @param user_code 用户名称
	 * @return 用户信息
	 */
	public User findUserByUser_name(String user_code);

	/**
	 * 根据用户编号更改用户信息
	 * 
	 * @param user
	 * @return
	 */
	public Integer updateUserByUserCode(User user);

	/**
	 * 动态查询员工信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	public List<User> getUser(SysFenye sysFenye);

	/**
	 * 动态查询员工信息总条数
	 * 
	 * @param sysFenye
	 * @return
	 */
	public Integer getUserCount(SysFenye sysFenye);

	/**
	 * 
	 * @param user_code
	 * @return
	 */
	public Integer delByUsercode(String user_code);
}
