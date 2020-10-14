package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.UserDao;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	@Async
	public Integer updateUserByUserCode(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserByUserCode(user);
	}

	@Override
	public Map<String, Object> getUser(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		List<User> uList=userDao.getUser(sysFenye);
		Integer count=userDao.getUserCount(sysFenye);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", count);
		map.put("data", uList);
		return map;
	}

}
