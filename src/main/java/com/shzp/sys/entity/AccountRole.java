package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Table(name = "sys_account_role")
@Component
public class AccountRole implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String acc_code;
	private String role_code;

	public AccountRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountRole(Integer id, String acc_code, String role_code) {
		super();
		this.id = id;
		this.acc_code = acc_code;
		this.role_code = role_code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcc_code() {
		return acc_code;
	}

	public void setAcc_code(String acc_code) {
		this.acc_code = acc_code;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AccountRole [id=" + id + ", acc_code=" + acc_code + ", role_code=" + role_code + "]";
	}

}
