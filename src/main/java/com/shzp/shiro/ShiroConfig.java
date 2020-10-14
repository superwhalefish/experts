package com.shzp.shiro;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shzp.sys.dao.ModuleDao;
import com.shzp.sys.entity.Module;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

@Configuration
public class ShiroConfig {
	@Autowired
	private ModuleDao moduleDao;
	
	/**
	 * 创建ShiroFilterFactoryBean 用户主题
	 */
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(
			@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

		// 设置安全管理器
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		// 添加过滤器
		/**
		 * shiro内置过滤器（实现权限相关拦击） 常用过滤器： anon:无需认证（登陆）可以访问 authc:必须认证才可以访问
		 * user:如果使用rememberMe的功能可以直接访问 perms:该资源必须得到资源权限才可以访问 role:该资源必须得到角色权限才可以访问
		 */
		Map<String, String> filterMap = new LinkedHashMap<String, String>();
		// 放行页面
		 filterMap.put("/proinfo/intupd", "anon");
		// 授权过滤器
		filterMap.put("/menu", "authc");
		List<Module> module = moduleDao.findModuleAll();
		for (int i = 0; i < module.size(); i++) {
			filterMap.put(module.get(i).getModule_url(), "perms[" + module.get(i).getModule_code() + "]");
		}
		// 拦截页面
		filterMap.put("/system/*", "authc");
		filterMap.put("/proinfo/*", "authc");
		filterMap.put("/usr/*", "authc");
		filterMap.put("/ord/*", "authc");
		
		//logout是shiro提供的过滤器,这是走自定义的 shiroLogoutFilter 上面有配置
		filterMap.put("/index", "logout");
		// 无用户登录跳转页面
		shiroFilterFactoryBean.setLoginUrl("/index");
		// 无权限访问页面
		shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;
	}

	/**
	 * 创建DefaultWebSecurityManager 安全管理器
	 */
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		// 关联realm
		securityManager.setRealm(userRealm);
		return securityManager;
	}

	/**
	 * 创建Realm
	 */
	@Bean(name = "userRealm")
	public UserRealm getRealm() {
		return new UserRealm();
	}

	/**
	 * 配置shiroDialect,用于thymeleaf和shiro标签配合使用
	 */
	@Bean
	public ShiroDialect getShiroDialect() {
		return new ShiroDialect();
	}
	public ShiroLogoutFilter shiroLogoutFilter() {
		ShiroLogoutFilter shiroLogoutFilter = new ShiroLogoutFilter();
		 shiroLogoutFilter.setRedirectUrl("/index");
		return shiroLogoutFilter;
		
	}
}
