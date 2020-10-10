package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Table(name = "acc_account")
@Component
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
private Integer id;
private String acc_code;
private String acc_name;
private String acc_password;
private String user_code;
private String lasttime;
private String acc_state;
private String acc_end;
private String acc_start;
private String acc_show;

private User user;

public Account() {
	super();
	// TODO Auto-generated constructor stub
}

public Account(Integer id, String acc_code, String acc_name, String acc_password, String user_code, String lasttime,
		String acc_state, String acc_end, String acc_start, String acc_show, User user) {
	super();
	this.id = id;
	this.acc_code = acc_code;
	this.acc_name = acc_name;
	this.acc_password = acc_password;
	this.user_code = user_code;
	this.lasttime = lasttime;
	this.acc_state = acc_state;
	this.acc_end = acc_end;
	this.acc_start = acc_start;
	this.acc_show = acc_show;
	this.user = user;
}

public String getAcc_show() {
	return acc_show;
}

public void setAcc_show(String acc_show) {
	this.acc_show = acc_show;
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

public String getAcc_name() {
	return acc_name;
}

public void setAcc_name(String acc_name) {
	this.acc_name = acc_name;
}

public String getAcc_password() {
	return acc_password;
}

public void setAcc_password(String acc_password) {
	this.acc_password = acc_password;
}

public String getUser_code() {
	return user_code;
}

public void setUser_code(String user_code) {
	this.user_code = user_code;
}

public String getLasttime() {
	return lasttime;
}

public void setLasttime(String lasttime) {
	this.lasttime = lasttime;
}

public String getAcc_state() {
	return acc_state;
}

public void setAcc_state(String acc_state) {
	this.acc_state = acc_state;
}

public String getAcc_end() {
	return acc_end;
}

public void setAcc_end(String acc_end) {
	this.acc_end = acc_end;
}

public String getAcc_start() {
	return acc_start;
}

public void setAcc_start(String acc_start) {
	this.acc_start = acc_start;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	return "Account [id=" + id + ", acc_code=" + acc_code + ", acc_name=" + acc_name + ", acc_password=" + acc_password
			+ ", user_code=" + user_code + ", lasttime=" + lasttime + ", acc_state=" + acc_state + ", acc_end="
			+ acc_end + ", acc_start=" + acc_start + ", acc_show=" + acc_show + ", user=" + user + "]";
}


}
