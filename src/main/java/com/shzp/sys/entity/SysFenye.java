package com.shzp.sys.entity;

import org.springframework.stereotype.Component;

@Component
public class SysFenye {
	private Integer page;
	private Integer limit;
	private Account account;// 账号
	private Role role;// 权限
	
	private User user;
	public Integer getPage() {
		return page;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public void setPage(Integer page) {
		this.page = page;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "SysFenye [page=" + page + ", limit=" + limit + ", account=" + account + ", role=" + role + ", user="
				+ user + "]";
	}
	
}
