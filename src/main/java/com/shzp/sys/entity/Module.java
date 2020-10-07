package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "sys_module")
@Component
public class Module implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String module_code;
	private String module;
	private String parentid;
	private String module_url;

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Module(Integer id, String module_code, String module, String parentid, String module_url) {
		super();
		this.id = id;
		this.module_code = module_code;
		this.module = module;
		this.parentid = parentid;
		this.module_url = module_url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModule_code() {
		return module_code;
	}

	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getModule_url() {
		return module_url;
	}

	public void setModule_url(String module_url) {
		this.module_url = module_url;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", module_code=" + module_code + ", module=" + module + ", parentid=" + parentid
				+ ", module_url=" + module_url + "]";
	}

}
