package com.shzp.product.entity;

import org.springframework.stereotype.Component;

@Component
public class ProTypeInfo {
	private Integer id;
	private String typename;
	private String typecode;
	private Integer typenum;
	public ProTypeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProTypeInfo(Integer id, String typename, String typecode, Integer typenum) {
		super();
		this.id = id;
		this.typename = typename;
		this.typecode = typecode;
		this.typenum = typenum;
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
	 * @return the typenum
	 */
	public Integer getTypenum() {
		return typenum;
	}
	/**
	 * @param typenum the typenum to set
	 */
	public void setTypenum(Integer typenum) {
		this.typenum = typenum;
	}
	@Override
	public String toString() {
		return "ProTypeInfo [id=" + id + ", typename=" + typename + ", typecode=" + typecode + ", typenum=" + typenum
				+ "]";
	}
	
}
