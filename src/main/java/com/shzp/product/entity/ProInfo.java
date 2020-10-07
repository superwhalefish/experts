package com.shzp.product.entity;

public class ProInfo {
	private Integer id;
	private String pcode;
	private String speccode;
	private String pname;
	private Integer pprice;
	private Integer ptypestate;
	private String pweight;
	private Integer pstate;
	private Integer plimit;
	private String pbrandcode;
	private String punitcode;
	private String pwarehousecode;
	private String pstockscode;
	//private String starttime;
	//private String upstarttime;
	private String poperate;
	private String putawaytime;
	private String prosaletime;
	private String englishname;
	private String imgcode;
	public ProInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProInfo(Integer id, String pcode, String speccode, String pname, Integer pprice, Integer ptypestate,
			String pweight, Integer pstate, Integer plimit, String pbrandcode, String punitcode, String pwarehousecode,
			String pstockscode, String poperate, String putawaytime, String prosaletime, String englishname,
			String imgcode) {
		super();
		this.id = id;
		this.pcode = pcode;
		this.speccode = speccode;
		this.pname = pname;
		this.pprice = pprice;
		this.ptypestate = ptypestate;
		this.pweight = pweight;
		this.pstate = pstate;
		this.plimit = plimit;
		this.pbrandcode = pbrandcode;
		this.punitcode = punitcode;
		this.pwarehousecode = pwarehousecode;
		this.pstockscode = pstockscode;
		this.poperate = poperate;
		this.putawaytime = putawaytime;
		this.prosaletime = prosaletime;
		this.englishname = englishname;
		this.imgcode = imgcode;
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
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the pprice
	 */
	public Integer getPprice() {
		return pprice;
	}

	/**
	 * @param pprice the pprice to set
	 */
	public void setPprice(Integer pprice) {
		this.pprice = pprice;
	}

	/**
	 * @return the ptypestate
	 */
	public Integer getPtypestate() {
		return ptypestate;
	}

	/**
	 * @param ptypestate the ptypestate to set
	 */
	public void setPtypestate(Integer ptypestate) {
		this.ptypestate = ptypestate;
	}

	/**
	 * @return the pweight
	 */
	public String getPweight() {
		return pweight;
	}

	/**
	 * @param pweight the pweight to set
	 */
	public void setPweight(String pweight) {
		this.pweight = pweight;
	}

	/**
	 * @return the pstate
	 */
	public Integer getPstate() {
		return pstate;
	}

	/**
	 * @param pstate the pstate to set
	 */
	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}

	/**
	 * @return the plimit
	 */
	public Integer getPlimit() {
		return plimit;
	}

	/**
	 * @param plimit the plimit to set
	 */
	public void setPlimit(Integer plimit) {
		this.plimit = plimit;
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

	/**
	 * @return the pwarehousecode
	 */
	public String getPwarehousecode() {
		return pwarehousecode;
	}

	/**
	 * @param pwarehousecode the pwarehousecode to set
	 */
	public void setPwarehousecode(String pwarehousecode) {
		this.pwarehousecode = pwarehousecode;
	}

	/**
	 * @return the pstockscode
	 */
	public String getPstockscode() {
		return pstockscode;
	}

	/**
	 * @param pstockscode the pstockscode to set
	 */
	public void setPstockscode(String pstockscode) {
		this.pstockscode = pstockscode;
	}

	/**
	 * @return the poperate
	 */
	public String getPoperate() {
		return poperate;
	}

	/**
	 * @param poperate the poperate to set
	 */
	public void setPoperate(String poperate) {
		this.poperate = poperate;
	}

	/**
	 * @return the putawaytime
	 */
	public String getPutawaytime() {
		return putawaytime;
	}

	/**
	 * @param putawaytime the putawaytime to set
	 */
	public void setPutawaytime(String putawaytime) {
		this.putawaytime = putawaytime;
	}

	/**
	 * @return the prosaletime
	 */
	public String getProsaletime() {
		return prosaletime;
	}

	/**
	 * @param prosaletime the prosaletime to set
	 */
	public void setProsaletime(String prosaletime) {
		this.prosaletime = prosaletime;
	}

	/**
	 * @return the englishname
	 */
	public String getEnglishname() {
		return englishname;
	}

	/**
	 * @param englishname the englishname to set
	 */
	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}

	/**
	 * @return the imgcode
	 */
	public String getImgcode() {
		return imgcode;
	}

	/**
	 * @param imgcode the imgcode to set
	 */
	public void setImgcode(String imgcode) {
		this.imgcode = imgcode;
	}

	@Override
	public String toString() {
		return "Proinfro [id=" + id + ", pcode=" + pcode + ", speccode=" + speccode + ", pname=" + pname + ", pprice="
				+ pprice + ", ptypestate=" + ptypestate + ", pweight=" + pweight + ", pstate=" + pstate + ", plimit="
				+ plimit + ", pbrandcode=" + pbrandcode + ", punitcode=" + punitcode + ", pwarehousecode="
				+ pwarehousecode + ", pstockscode=" + pstockscode + ", poperate=" + poperate + ", putawaytime="
				+ putawaytime + ", prosaletime=" + prosaletime + ", englishname=" + englishname + ", imgcode=" + imgcode
				+ "]";
	}
	
}
