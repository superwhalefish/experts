package com.shzp.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.product.dao.ProInfoDao;
import com.shzp.product.entity.ProInfo;
import com.shzp.product.service.ProInfoService;

@Service
public class ProInfoServerImpl implements ProInfoService {
	
	@Autowired
	private ProInfoDao proInfoDao;
	
	@Override
	public List<ProInfo> ProInfoAll(ProInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

}
