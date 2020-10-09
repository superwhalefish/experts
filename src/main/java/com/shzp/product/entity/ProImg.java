package com.shzp.product.entity;

import org.springframework.stereotype.Component;

@Component
public class ProImg {
	private Integer id;
	private String istate;
	private String iurl;
	private String imgoperage;
	public ProImg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProImg(Integer id, String istate, String iurl, String imgoperage) {
		super();
		this.id = id;
		this.istate = istate;
		this.iurl = iurl;
		this.imgoperage = imgoperage;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the istate
	 */
	public String getIstate() {
		return istate;
	}
	/**
	 * @param istate the istate to set
	 */
	public void setIstate(String istate) {
		this.istate = istate;
	}
	/**
	 * @return the iurl
	 */
	public String getIurl() {
		return iurl;
	}
	/**
	 * @param iurl the iurl to set
	 */
	public void setIurl(String iurl) {
		this.iurl = iurl;
	}
	/**
	 * @return the imgoperage
	 */
	public String getImgoperage() {
		return imgoperage;
	}
	/**
	 * @param imgoperage the imgoperage to set
	 */
	public void setImgoperage(String imgoperage) {
		this.imgoperage = imgoperage;
	}
	@Override
	public String toString() {
		return "Proimg [id=" + id + ", istate=" + istate + ", iurl=" + iurl + ", imgoperage=" + imgoperage + "]";
	}
	
}
