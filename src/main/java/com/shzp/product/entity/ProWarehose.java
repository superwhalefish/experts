package com.shzp.product.entity;

public class ProWarehose {
	private Integer id;
	private String pcode;
	private String wname;
	private String wstate;
	
	public ProWarehose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProWarehose(Integer id, String pcode, String wname, String wstate) {
		super();
		this.id = id;
		this.pcode = pcode;
		this.wname = wname;
		this.wstate = wstate;
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
	 * @return the pcode
	 */
	public String getPcode() {
		return pcode;
	}

	/**
	 * @param pcode the pcode to set
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	/**
	 * @return the wname
	 */
	public String getWname() {
		return wname;
	}

	/**
	 * @param wname the wname to set
	 */
	public void setWname(String wname) {
		this.wname = wname;
	}

	/**
	 * @return the wstate
	 */
	public String getWstate() {
		return wstate;
	}

	/**
	 * @param wstate the wstate to set
	 */
	public void setWstate(String wstate) {
		this.wstate = wstate;
	}

	@Override
	public String toString() {
		return "ProWarehose [id=" + id + ", pcode=" + pcode + ", wname=" + wname + ", wstate=" + wstate + "]";
	}
	
}
