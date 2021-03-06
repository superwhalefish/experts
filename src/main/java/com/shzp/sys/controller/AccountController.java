package com.shzp.sys.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.AccountService;

@Controller
@RequestMapping(value = "/auth")
@CrossOrigin
public class AccountController {
	@Autowired
	private AccountService accountService;

	@Autowired
	private SysFenye sysFenye;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(String usr, String psw) {
		return accountService.login(usr,psw);
	}

	/**
	 * 退出
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "index";

	}

	/**
	 * 动态查询账号信息
	 * 
	 * @param page
	 * @param limit
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/getAccount", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAccount(Integer page, Integer limit, Account account) {
		sysFenye.setAccount(account);
		sysFenye.setPage((page - 1) * limit);
		sysFenye.setLimit(limit);
		Map<String, Object> account2 = accountService.getAccount(sysFenye);
		return account2;

	}

	/**
	 * 修改账号信息 （暂未操作记录表）
	 * 
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/updateAccount", method = RequestMethod.POST)
	@ResponseBody
	public Integer updateAccount(Account account) {
		return accountService.updateAccount(account);
	}

	@RequestMapping(value = "/getAccountInfo", method = RequestMethod.POST)
	@ResponseBody
	public List<Account> getAccountInfo(String acc_code) {

		return accountService.getAccountInfo(acc_code);
	}

	@RequestMapping(value = "/delByAcc_code", method = RequestMethod.POST)
	@ResponseBody
	public Integer delByAcc_code(String acc_code) {
		return accountService.delByAcc_code(acc_code);

	}
}
