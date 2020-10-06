package com.shzp.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroController {

	/**
	 * 创建ShiroFilterFactoryBean
	 */
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

		// 设置安全管理器securityManager
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		// 添加过滤器
		/**
		 * shiro内置过滤器（实现权限相关拦击） 常用过滤器： anon:无需认证（登陆）可以访问 authc:必须认证才可以访问
		 * user:如果使用rememberMe的功能可以直接访问 perms:该资源必须得到资源权限才可以访问 role:该资源必须得到角色权限才可以访问
		 */
		Map<String, String> filterMap = new LinkedHashMap<String, String>();
		// 放行页面bl
		// filterMap.put("/student/index", "anon");

		// 授权过滤器
		filterMap.put("/expert/**", "perms[expert]");
		filterMap.put("/user/**", "perms[user]");

		// 拦截页面
		filterMap.put("/expert/**", "authc");
		filterMap.put("/user/**", "authc");

		// 无用户登录跳转页面
		shiroFilterFactoryBean.setLoginUrl("/index.html");
		// 无权限访问页面
		shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth.html");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;  
	}

	/**
	 * 创建DefaultWebSecurityManager
	 */
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") ShiroRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		// 关联realm
		securityManager.setRealm(userRealm);
		return securityManager;
	}

	/**
	 * 创建Realm
	 */
	@Bean(name = "shiroRealm")
	public ShiroRealm getRealm() {
		return new ShiroRealm();
	}
}
