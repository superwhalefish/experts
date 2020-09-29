package com.shzp.sys.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
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
	    public String submitLogin(String username, String password, HttpServletRequest request) {
	        try {
	            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
	            Subject subject = SecurityUtils.getSubject();
	            subject.login(token);
	            Account user = (Account) subject.getPrincipal();
	        } catch (DisabledAccountException e) {
	            request.setAttribute("msg", "账户已被禁用");
	            return "login";
	        } catch (AuthenticationException e) {
	            request.setAttribute("msg", "用户名或密码错误");
	            return "login";
	        }

	        // 执行到这里说明用户已登录成功
	        return "redirect:/auth/index";
	    }


	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String loginPage() {
	        return "login";
	    }

	    //被踢出后跳转的页面
	    @RequestMapping(value = "/kickout", method = RequestMethod.GET)
	    public String kickOut() {
	        return "kickout";
	    }

}
