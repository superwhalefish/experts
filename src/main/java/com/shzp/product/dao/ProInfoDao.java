package com.shzp.product.dao;

import java.util.List;

import com.shzp.product.entity.proFenye;
import com.shzp.product.entity.ProInfo;

public interface ProInfoDao {
	/**
	 * 
	 * @param info
	 * @return
	 */
	List<ProInfo> selProInfo(proFenye<ProInfo> fenye); 
	/**
	 * 总条数
	 * @param fenye
	 * @return
	 */
	Integer selProInfoCount(proFenye<ProInfo> fenye);
	
}
