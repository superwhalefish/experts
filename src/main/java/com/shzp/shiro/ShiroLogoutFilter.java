package com.shzp.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

public class ShiroLogoutFilter extends LogoutFilter {
	/**
	 * 退出清理缓存信息
	 */
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {

		Subject subject = getSubject(request, response);
		subject.logout();
		// 获取登出后重定向到的地址
		String redirectUrl = getRedirectUrl(request, response, subject);
		// 重定向
		issueRedirect(request, response, redirectUrl);
		return false;

	}
}
