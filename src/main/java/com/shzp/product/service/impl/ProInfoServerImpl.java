package com.shzp.product.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.product.dao.ProInfoDao;
import com.shzp.product.entity.proFenye;
import com.shzp.product.entity.ProInfo;
import com.shzp.product.service.ProInfoService;

@Service
public class ProInfoServerImpl implements ProInfoService {
	
	@Autowired
	private ProInfoDao proInfoDao;
	
	@Override
	public Map<String, Object> selProInfo(proFenye<ProInfo> profenye) {
		// TODO Auto-generated method stub
		System.out.println(profenye);
		List<ProInfo> selProInfo = proInfoDao.selProInfo(profenye);
		System.out.println(profenye);
		Integer selProInfoCount = proInfoDao.selProInfoCount(profenye);
		Map<String, Object> mmp=new HashMap<String, Object>();
		mmp.put("msg", "");
		mmp.put("code", 0);
		mmp.put("data", selProInfo);
		mmp.put("count", selProInfoCount);
		return mmp;
	}
	
	
}
