package com.shzp.product.entity;

public class ProSpecType {
	private Integer id;
	private String typename;
	private String typecode;
	private String spectypenum;
	public ProSpecType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProSpecType(Integer id, String typename, String typecode, String spectypenum) {
		super();
		this.id = id;
		this.typename = typename;
		this.typecode = typecode;
		this.spectypenum = spectypenum;
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
	 * @return the typename
	 */
	public String getTypename() {
		return typename;
	}
	/**
	 * @param typename the typename to set
	 */
	public void setTypename(String typename) {
		this.typename = typename;
	}
	/**
	 * @return the typecode
	 */
	public String getTypecode() {
		return typecode;
	}
	/**
	 * @param typecode the typecode to set
	 */
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
	/**
	 * @return the spectypenum
	 */
	public String getSpectypenum() {
		return spectypenum;
	}
	/**
	 * @param spectypenum the spectypenum to set
	 */
	public void setSpectypenum(String spectypenum) {
		this.spectypenum = spectypenum;
	}
	@Override
	public String toString() {
		return "ProSpecType [id=" + id + ", typename=" + typename + ", typecode=" + typecode + ", spectypenum="
				+ spectypenum + "]";
	}
	
}
