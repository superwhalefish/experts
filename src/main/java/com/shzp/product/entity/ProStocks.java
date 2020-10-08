package com.shzp.product.entity;

public class ProStocks {
	private Integer id;
	private Integer num;
	private Integer realitynum;
	private String pstockscode;
	private String typecode;
	public ProStocks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProStocks(Integer id, Integer num, Integer realitynum, String pstockscode, String typecode) {
		super();
		this.id = id;
		this.num = num;
		this.realitynum = realitynum;
		this.pstockscode = pstockscode;
		this.typecode = typecode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getRealitynum() {
		return realitynum;
	}
	public void setRealitynum(Integer realitynum) {
		this.realitynum = realitynum;
	}
	public String getPstockscode() {
		return pstockscode;
	}
	public void setPstockscode(String pstockscode) {
		this.pstockscode = pstockscode;
	}
	public String getTypecode() {
		return typecode;
	}
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
	@Override
	public String toString() {
		return "ProStocks [id=" + id + ", num=" + num + ", realitynum=" + realitynum + ", pstockscode=" + pstockscode
				+ ", typecode=" + typecode + "]";
	}
	
}
