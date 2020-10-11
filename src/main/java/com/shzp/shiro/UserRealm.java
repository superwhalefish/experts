package com.shzp.shiro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shzp.sys.dao.AccountDao;
import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.dao.ModuleDao;
import com.shzp.sys.dao.RoleModuleDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.Module;
import com.shzp.utils.MD5Plus;

public class UserRealm extends AuthorizingRealm {
	// 业务注入
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private AccountRoleDao accountRoleDao;
	@Autowired
	private RoleModuleDao roleModuleDao;
	@Autowired
	private ModuleDao moduleDao;
	/**
	 * 执行授权逻辑 授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		// 给资源进行授权
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		// 查询当前用户权限
		// 获取当前登陆用户信息
		Subject subject = SecurityUtils.getSubject();
		Account acc = (Account) subject.getPrincipal();
		List<String> roleCodes = accountRoleDao.findRoleByAcc_code(acc.getAcc_code());
		List<String> moduleCodes = roleModuleDao.findModuleCodeByRoleCode(roleCodes);
		// 添加资源的授权 字符串需和shiro配置认证授权perms[]内的内容保持一直
		info.addStringPermissions(moduleCodes);
		//152A7E134B50BF8B97599A6B35EDA628
		return info;
	}
	/**
	 * 执行认证逻辑 登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 编写shiro认证逻辑，判断用户名和密码
		// 判断用户名
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
		//System.out.println("获取密码"+new String(token.getPassword()));
		Account user = accountDao.findByAcc_name(token.getUsername());
		if (user == null) {
			return null;// shiro底层将抛出UnKnownAccountException异常
		}
		if(!"1".equals(user.getAcc_state())) {
			throw new LockedAccountException();
		}
		// 判断密码
		// 第一个参数是subject.login(token)的数据 第二个参数是数据库密码 第三个参数是盐–用于加密密码对比 第四个密码是shiro的名字
		
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, user.getAcc_password(), getName());
		
		return simpleAuthenticationInfo;
	}

}
