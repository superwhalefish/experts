package com.shzp.product.entity;

public class ProPrice {
	private Integer id;
	private String plingshou;//-1
	private String ppifa;//1
	private String ppifal;//2
	public ProPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProPrice(Integer id, String plingshou, String ppifa, String ppifal) {
		super();
		this.id = id;
		this.plingshou = plingshou;
		this.ppifa = ppifa;
		this.ppifal = ppifal;
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
	 * @return the plingshou
	 */
	public String getPlingshou() {
		return plingshou;
	}
	/**
	 * @param plingshou the plingshou to set
	 */
	public void setPlingshou(String plingshou) {
		this.plingshou = plingshou;
	}
	/**
	 * @return the ppifa
	 */
	public String getPpifa() {
		return ppifa;
	}
	/**
	 * @param ppifa the ppifa to set
	 */
	public void setPpifa(String ppifa) {
		this.ppifa = ppifa;
	}
	/**
	 * @return the ppifal
	 */
	public String getPpifal() {
		return ppifal;
	}
	/**
	 * @param ppifal the ppifal to set
	 */
	public void setPpifal(String ppifal) {
		this.ppifal = ppifal;
	}
	@Override
	public String toString() {
		return "Proprice [id=" + id + ", plingshou=" + plingshou + ", ppifa=" + ppifa + ", ppifal=" + ppifal + "]";
	}
	
}
