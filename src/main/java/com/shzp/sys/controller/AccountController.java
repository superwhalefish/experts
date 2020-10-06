package com.shzp.sys.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shzp.sys.entity.Account;

@Controller
@RequestMapping(value = "/auth")
@CrossOrigin
public class AccountController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitLogin(String usr, String psw) {
		// 获取
		Subject subject = SecurityUtils.getSubject();
		// 封装
		UsernamePasswordToken token = new UsernamePasswordToken(usr, psw);
		try {
			subject.login(token);
			// 重定向请求 return "redirect:/toLogin";
			// 登陆成功
			return "redirect:/index";
		} catch (UnknownAccountException e) {
			// 用户名不存在
			System.out.println("用户名不存在");
			return "toLogin";
		} catch (IncorrectCredentialsException e) {
			// 密码错误
			System.out.println("密码错误");
			return "toLogin";
		}
	}

}
