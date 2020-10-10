package com.shzp.product.entity;

public class ProPrice {
	private Integer id;
	private String plingshou;//-1
	private String ppifa;//1
	private String ppifal;//2
	private String pricestate;//
	private String jgcode;
	public ProPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProPrice(Integer id, String plingshou, String ppifa, String ppifal, String pricestate, String jgcode) {
		super();
		this.id = id;
		this.plingshou = plingshou;
		this.ppifa = ppifa;
		this.ppifal = ppifal;
		this.pricestate = pricestate;
		this.jgcode = jgcode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlingshou() {
		return plingshou;
	}
	public void setPlingshou(String plingshou) {
		this.plingshou = plingshou;
	}
	public String getPpifa() {
		return ppifa;
	}
	public void setPpifa(String ppifa) {
		this.ppifa = ppifa;
	}
	public String getPpifal() {
		return ppifal;
	}
	public void setPpifal(String ppifal) {
		this.ppifal = ppifal;
	}
	public String getPricestate() {
		return pricestate;
	}
	public void setPricestate(String pricestate) {
		this.pricestate = pricestate;
	}
	public String getJgcode() {
		return jgcode;
	}
	public void setJgcode(String jgcode) {
		this.jgcode = jgcode;
	}
	@Override
	public String toString() {
		return "ProPrice [id=" + id + ", plingshou=" + plingshou + ", ppifa=" + ppifa + ", ppifal=" + ppifal
				+ ", pricestate=" + pricestate + ", jgcode=" + jgcode + "]";
	}
	
	
}
