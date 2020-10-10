package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.dao.UserDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.AccountRoleService;
import com.shzp.sys.service.AccountService;
import com.shzp.sys.service.RoleModuleService;
import com.shzp.sys.service.UserService;
import com.shzp.utils.MD5Plus;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;
	@Autowired
	private AccountRoleService accountRoleService;

	@Override
	public Account findByAcc_name(String acc_name) {
		// TODO Auto-generated method stub
		return accountDao.findByAcc_name(acc_name);
	}

	@Override
	public Map<String, Object> getAccount(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		if (sysFenye.getAccount().getUser_code().length() > 0) {
			User user = userDao.findUserByUser_name(sysFenye.getAccount().getUser_code());
			sysFenye.getAccount().setUser_code(user.getUser_code());
			;
		}
		List<Account> account = accountDao.getAccount(sysFenye);
		Integer accountCount = accountDao.getAccountCount(sysFenye);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", accountCount);
		map.put("data", account);
		return map;
	}

	@Override
	public Integer updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	}

	@Override
	public List<Account> getAccountInfo(String acc_code) {
		// TODO Auto-generated method stub
		List<Account> accountlist = accountDao.getAccountInfo(acc_code);
		return accountlist;
	}

	@Override
	public Integer delByAcc_code(String acc_code) {
		// TODO Auto-generated method stub
		Account acc = accountDao.findByAcc_code(acc_code);
		Integer delByAcc_code = accountDao.delByAcc_code(acc_code);
		if (delByAcc_code > 0) {
			User user = new User();
			user.setUser_code(acc.getUser_code());
			user.setUser_accountstate("2");
			userService.updateUserByUserCode(user);
			accountRoleService.delRole_codeByAcc_code(acc_code);
		}
		return delByAcc_code;
	}

	@Override
	public String login(String usr, String psw) {
		// 获取
				Subject subject = SecurityUtils.getSubject();
				// 封装
				UsernamePasswordToken token = new UsernamePasswordToken(usr, MD5Plus.getPsw(usr, psw));
				try {
					subject.login(token);
					return "SUCCESS";
				} catch (UnknownAccountException e) {
					return "NOUSR";
				} catch (IncorrectCredentialsException e) {
					return "PEWERROR";
				}catch (LockedAccountException e) {
					return "LOCK";
				}
	}

}
