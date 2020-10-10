package com.shzp.sys.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.UserDao;
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

}
