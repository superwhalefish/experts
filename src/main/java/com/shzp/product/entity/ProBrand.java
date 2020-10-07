package com.shzp.product.entity;

public class ProBrand {
	private Integer id;
	private String bname;
	private String pbrandcode;
	private String bpingname;
	public ProBrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProBrand(Integer id, String bname, String pbrandcode, String bpingname) {
		super();
		this.id = id;
		this.bname = bname;
		this.pbrandcode = pbrandcode;
		this.bpingname = bpingname;
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
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * @return the pbrandcode
	 */
	public String getPbrandcode() {
		return pbrandcode;
	}
	/**
	 * @param pbrandcode the pbrandcode to set
	 */
	public void setPbrandcode(String pbrandcode) {
		this.pbrandcode = pbrandcode;
	}
	/**
	 * @return the bpingname
	 */
	public String getBpingname() {
		return bpingname;
	}
	/**
	 * @param bpingname the bpingname to set
	 */
	public void setBpingname(String bpingname) {
		this.bpingname = bpingname;
	}
	@Override
	public String toString() {
		return "Probrand [id=" + id + ", bname=" + bname + ", pbrandcode=" + pbrandcode + ", bpingname=" + bpingname
				+ "]";
	}
	
}
