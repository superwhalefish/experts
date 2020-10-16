package com.shzp.sys.entity;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "cus_coupon")
@Component
public class Coupon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String cou_name;
	private String cou_discount;
	private String cou_mitigate;
	private String cou_state;
	private String cou_usestate;
	private String cou_starttime;
	private String cou_endtime;
	private String cou_typestate;
	private String cou_daytime;
	private String cou_num;
	private String coupon_code;
	private String pccode;
	private String cou_pcstate;
	
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coupon(Integer id, String cou_name, String cou_discount, String cou_mitigate, String cou_state,
			String cou_usestate, String cou_starttime, String cou_endtime, String cou_typestate, String cou_daytime,
			String cou_num, String coupon_code, String pccode, String cou_pcstate) {
		super();
		this.id = id;
		this.cou_name = cou_name;
		this.cou_discount = cou_discount;
		this.cou_mitigate = cou_mitigate;
		this.cou_state = cou_state;
		this.cou_usestate = cou_usestate;
		this.cou_starttime = cou_starttime;
		this.cou_endtime = cou_endtime;
		this.cou_typestate = cou_typestate;
		this.cou_daytime = cou_daytime;
		this.cou_num = cou_num;
		this.coupon_code = coupon_code;
		this.pccode = pccode;
		this.cou_pcstate = cou_pcstate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public String getCou_discount() {
		return cou_discount;
	}
	public void setCou_discount(String cou_discount) {
		this.cou_discount = cou_discount;
	}
	public String getCou_mitigate() {
		return cou_mitigate;
	}
	public void setCou_mitigate(String cou_mitigate) {
		this.cou_mitigate = cou_mitigate;
	}
	public String getCou_state() {
		return cou_state;
	}
	public void setCou_state(String cou_state) {
		this.cou_state = cou_state;
	}
	public String getCou_usestate() {
		return cou_usestate;
	}
	public void setCou_usestate(String cou_usestate) {
		this.cou_usestate = cou_usestate;
	}
	public String getCou_starttime() {
		return cou_starttime;
	}
	public void setCou_starttime(String cou_starttime) {
		this.cou_starttime = cou_starttime;
	}
	public String getCou_endtime() {
		return cou_endtime;
	}
	public void setCou_endtime(String cou_endtime) {
		this.cou_endtime = cou_endtime;
	}
	public String getCou_typestate() {
		return cou_typestate;
	}
	public void setCou_typestate(String cou_typestate) {
		this.cou_typestate = cou_typestate;
	}
	public String getCou_daytime() {
		return cou_daytime;
	}
	public void setCou_daytime(String cou_daytime) {
		this.cou_daytime = cou_daytime;
	}
	public String getCou_num() {
		return cou_num;
	}
	public void setCou_num(String cou_num) {
		this.cou_num = cou_num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getPccode() {
		return pccode;
	}

	public void setPccode(String pccode) {
		this.pccode = pccode;
	}

	public String getCou_pcstate() {
		return cou_pcstate;
	}

	public void setCou_pcstate(String cou_pcstate) {
		this.cou_pcstate = cou_pcstate;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", cou_name=" + cou_name + ", cou_discount=" + cou_discount + ", cou_mitigate="
				+ cou_mitigate + ", cou_state=" + cou_state + ", cou_usestate=" + cou_usestate + ", cou_starttime="
				+ cou_starttime + ", cou_endtime=" + cou_endtime + ", cou_typestate=" + cou_typestate + ", cou_daytime="
				+ cou_daytime + ", cou_num=" + cou_num + ", coupon_code=" + coupon_code + ", pccode=" + pccode
				+ ", cou_pcstate=" + cou_pcstate + "]";
	}
}
