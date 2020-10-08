package com.shzp.product.entity;

public class ProUnit {
	private Integer id;
	private String unit;
	private String ustate;
	private String punitcode;
	public ProUnit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProUnit(Integer id, String unit, String ustate, String punitcode) {
		super();
		this.id = id;
		this.unit = unit;
		this.ustate = ustate;
		this.punitcode = punitcode;
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
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the ustate
	 */
	public String getUstate() {
		return ustate;
	}
	/**
	 * @param ustate the ustate to set
	 */
	public void setUstate(String ustate) {
		this.ustate = ustate;
	}
	/**
	 * @return the punitcode
	 */
	public String getPunitcode() {
		return punitcode;
	}
	/**
	 * @param punitcode the punitcode to set
	 */
	public void setPunitcode(String punitcode) {
		this.punitcode = punitcode;
	}
	@Override
	public String toString() {
		return "ProUnit [id=" + id + ", unit=" + unit + ", ustate=" + ustate + ", punitcode=" + punitcode + "]";
	}
	
}
