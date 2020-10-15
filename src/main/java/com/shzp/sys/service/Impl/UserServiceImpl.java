package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.dao.UserDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.UserService;
import com.shzp.utils.PinYinUtil;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private PinYinUtil pinYinUtil;
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private AccountRoleDao accountRoleDao;

	@Override
	@Async
	public Integer updateUserByUserCode(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserByUserCode(user);
	}

	@Override
	public Map<String, Object> getUser(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		if (sysFenye.getUser().getUser_name() != null && sysFenye.getUser().getUser_name() != "") {
			String user_english = sysFenye.getUser().getUser_name();
			String pinYin = pinYinUtil.getPinYin(user_english);
			sysFenye.getUser().setUser_english(pinYin);
		}
		List<User> uList = userDao.getUser(sysFenye);
		Integer count = userDao.getUserCount(sysFenye);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", count);
		map.put("data", uList);
		return map;
	}

	@Override
	@Transactional
	public Integer delByUsercode(String user_code) {
		Account findByUser_code = accountDao.findByUser_code(user_code);
		accountDao.delByAcc_code(findByUser_code.getAcc_code());
		accountRoleDao.delRole_codeByAcc_code(findByUser_code.getAcc_code());
		Integer u = userDao.delByUsercode(user_code);
		return u;
	}

}
