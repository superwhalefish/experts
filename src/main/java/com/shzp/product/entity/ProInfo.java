package com.shzp.product.entity;

import org.springframework.stereotype.Component;

@Component
public class ProInfo {
	private Integer id;
	private String pcode;
	private String speccode;
	private String pname;
	private String pprice;
	private String ptypestate;
	private String pweight;
	private String pstate;
	private String plimit;
	private String pbrandcode;
	private String punitcode;
	private String pwarehousecode;
	private String pstockscode;
	private String starttime;//上传
	private String upstarttime;//修改
	private String poperate;//修改的操作
	private String putawaytime;//上架
	private String prosaletime;//预售
	private String englishname;
	private String imgcode;
	
	//类别
	private ProSpec proSpec;
	//价格
	private ProPrice proPrice;
	//品牌
	private ProBrand proBrand;
	//单位
	private ProUnit proUnit;
	//仓库
	private ProWarehose proWarehose;
	//库存
	private ProStocks proStocks;
	//图片
	private ProImg proImg;
	
	
	
	
	
	public ProInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProInfo(Integer id, String pcode, String speccode, String pname, String pprice, String ptypestate,
			String pweight, String pstate, String plimit, String pbrandcode, String punitcode, String pwarehousecode,
			String pstockscode, String starttime, String upstarttime, String poperate, String putawaytime,
			String prosaletime, String englishname, String imgcode, ProSpec proSpec, ProPrice proPrice,
			ProBrand proBrand, ProUnit proUnit, ProWarehose proWarehose, ProStocks proStocks, ProImg proImg) {
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
		this.starttime = starttime;
		this.upstarttime = upstarttime;
		this.poperate = poperate;
		this.putawaytime = putawaytime;
		this.prosaletime = prosaletime;
		this.englishname = englishname;
		this.imgcode = imgcode;
		this.proSpec = proSpec;
		this.proPrice = proPrice;
		this.proBrand = proBrand;
		this.proUnit = proUnit;
		this.proWarehose = proWarehose;
		this.proStocks = proStocks;
		this.proImg = proImg;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getSpeccode() {
		return speccode;
	}
	public void setSpeccode(String speccode) {
		this.speccode = speccode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPtypestate() {
		return ptypestate;
	}
	public void setPtypestate(String ptypestate) {
		this.ptypestate = ptypestate;
	}
	public String getPweight() {
		return pweight;
	}
	public void setPweight(String pweight) {
		this.pweight = pweight;
	}
	public String getPstate() {
		return pstate;
	}
	public void setPstate(String pstate) {
		this.pstate = pstate;
	}
	public String getPlimit() {
		return plimit;
	}
	public void setPlimit(String plimit) {
		this.plimit = plimit;
	}
	public String getPbrandcode() {
		return pbrandcode;
	}
	public void setPbrandcode(String pbrandcode) {
		this.pbrandcode = pbrandcode;
	}
	public String getPunitcode() {
		return punitcode;
	}
	public void setPunitcode(String punitcode) {
		this.punitcode = punitcode;
	}
	public String getPwarehousecode() {
		return pwarehousecode;
	}
	public void setPwarehousecode(String pwarehousecode) {
		this.pwarehousecode = pwarehousecode;
	}
	public String getPstockscode() {
		return pstockscode;
	}
	public void setPstockscode(String pstockscode) {
		this.pstockscode = pstockscode;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getUpstarttime() {
		return upstarttime;
	}
	public void setUpstarttime(String upstarttime) {
		this.upstarttime = upstarttime;
	}
	public String getPoperate() {
		return poperate;
	}
	public void setPoperate(String poperate) {
		this.poperate = poperate;
	}
	public String getPutawaytime() {
		return putawaytime;
	}
	public void setPutawaytime(String putawaytime) {
		this.putawaytime = putawaytime;
	}
	public String getProsaletime() {
		return prosaletime;
	}
	public void setProsaletime(String prosaletime) {
		this.prosaletime = prosaletime;
	}
	public String getEnglishname() {
		return englishname;
	}
	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}
	public String getImgcode() {
		return imgcode;
	}
	public void setImgcode(String imgcode) {
		this.imgcode = imgcode;
	}
	public ProSpec getProSpec() {
		return proSpec;
	}
	public void setProSpec(ProSpec proSpec) {
		this.proSpec = proSpec;
	}
	public ProPrice getProPrice() {
		return proPrice;
	}
	public void setProPrice(ProPrice proPrice) {
		this.proPrice = proPrice;
	}
	public ProBrand getProBrand() {
		return proBrand;
	}
	public void setProBrand(ProBrand proBrand) {
		this.proBrand = proBrand;
	}
	public ProUnit getProUnit() {
		return proUnit;
	}
	public void setProUnit(ProUnit proUnit) {
		this.proUnit = proUnit;
	}
	public ProWarehose getProWarehose() {
		return proWarehose;
	}
	public void setProWarehose(ProWarehose proWarehose) {
		this.proWarehose = proWarehose;
	}
	public ProStocks getProStocks() {
		return proStocks;
	}
	public void setProStocks(ProStocks proStocks) {
		this.proStocks = proStocks;
	}
	public ProImg getProImg() {
		return proImg;
	}
	public void setProImg(ProImg proImg) {
		this.proImg = proImg;
	}
	@Override
	public String toString() {
		return "ProInfo [id=" + id + ", pcode=" + pcode + ", speccode=" + speccode + ", pname=" + pname + ", pprice="
				+ pprice + ", ptypestate=" + ptypestate + ", pweight=" + pweight + ", pstate=" + pstate + ", plimit="
				+ plimit + ", pbrandcode=" + pbrandcode + ", punitcode=" + punitcode + ", pwarehousecode="
				+ pwarehousecode + ", pstockscode=" + pstockscode + ", starttime=" + starttime + ", upstarttime="
				+ upstarttime + ", poperate=" + poperate + ", putawaytime=" + putawaytime + ", prosaletime="
				+ prosaletime + ", englishname=" + englishname + ", imgcode=" + imgcode + ", proSpec=" + proSpec
				+ ", proPrice=" + proPrice + ", proBrand=" + proBrand + ", proUnit=" + proUnit + ", proWarehose="
				+ proWarehose + ", proStocks=" + proStocks + ", proImg=" + proImg + "]";
	}
	
}
