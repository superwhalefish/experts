package com.shzp.product.dao;

import java.util.List;

import com.shzp.product.entity.ProInfo;

public interface ProInfoDao {
	/**
	 * 
	 * @param info
	 * @return
	 */
	List<ProInfo> ProInfoAll(ProInfo info); 
	
}
