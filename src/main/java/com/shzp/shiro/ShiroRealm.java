package com.shzp.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.shzp.sys.dao.AccountRoleDao;
import com.shzp.sys.dao.RoleModuleDao;
import com.shzp.sys.entity.Account;

public class ShiroRealm extends AuthorizingRealm {
	@Autowired
	private AccountRoleDao accountRoleDao;
	@Autowired
	private RoleModuleDao  roleModuleDao;

	/**
	 * 赋予角色和权限:用户进行权限验证时 Shiro会去缓存中找,如果查不到数据,会执行这个方法去查权限,并放入缓存中
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// 获取用户
		Account account = (Account) principals.getPrimaryPrincipal();
		List<String> rolecode = accountRoleDao.findRoleByAcc_code(account.getAcc_code());
		List<String> moduleCodee = roleModuleDao.findModuleCodeByRoleCode(rolecode);
		for(int i=0;i<moduleCodee.size();i++) {
			 info.addStringPermission(moduleCodee.get(i));
		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
