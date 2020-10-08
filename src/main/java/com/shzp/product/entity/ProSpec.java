package com.shzp.product.entity;

public class ProSpec {
	private Integer id;
	private String speccode;
	private String specname;
	public ProSpec() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProSpec(Integer id, String speccode, String specname) {
		super();
		this.id = id;
		this.speccode = speccode;
		this.specname = specname;
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
	 * @return the speccode
	 */
	public String getSpeccode() {
		return speccode;
	}
	/**
	 * @param speccode the speccode to set
	 */
	public void setSpeccode(String speccode) {
		this.speccode = speccode;
	}
	/**
	 * @return the specname
	 */
	public String getSpecname() {
		return specname;
	}
	/**
	 * @param specname the specname to set
	 */
	public void setSpecname(String specname) {
		this.specname = specname;
	}
	@Override
	public String toString() {
		return "Prospec [id=" + id + ", speccode=" + speccode + ", specname=" + specname + "]";
	}
	
}
