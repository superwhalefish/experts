package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "usr_user")
@Component
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String user_name;
	private String user_code;
	private String position_code;
	private String user_tel;
	private String user_qq;
	private String user_email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String user_name, String user_code, String position_code, String user_tel, String user_qq,
			String user_email) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_code = user_code;
		this.position_code = position_code;
		this.user_tel = user_tel;
		this.user_qq = user_qq;
		this.user_email = user_email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getPosition_code() {
		return position_code;
	}

	public void setPosition_code(String position_code) {
		this.position_code = position_code;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public String getUser_qq() {
		return user_qq;
	}

	public void setUser_qq(String user_qq) {
		this.user_qq = user_qq;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_code=" + user_code + ", position_code="
				+ position_code + ", user_tel=" + user_tel + ", user_qq=" + user_qq + ", user_email=" + user_email
				+ "]";
	}

}
