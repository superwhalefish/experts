package com.shzp.product.dao;

import com.shzp.product.entity.ProBrand;
import com.shzp.product.entity.ProImg;
import com.shzp.product.entity.ProPrice;
import com.shzp.product.entity.ProSpec;
import com.shzp.product.entity.ProSpecType;
import com.shzp.product.entity.ProStocks;
import com.shzp.product.entity.ProTypeInfo;
import com.shzp.product.entity.ProUnit;
import com.shzp.product.entity.ProWarehose;

public interface ProUtil {
	
	ProSpec selProSpec(String speccode);
	
	ProPrice selProPrice(String jdcode);
	
	ProBrand selProBrand(String pbrandcode);
	
	ProUnit selProUnit(String punitcode);
	
	ProWarehose selProWarehose(String pcode);
	
	ProStocks selProStocks(String typecode);
	
	ProSpecType selProSpecType(String typecode);
	
	ProTypeInfo selProTypeInfo(String typecode);
	
	ProImg selProImg(String imgcode);
}
