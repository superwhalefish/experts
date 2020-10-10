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
	public Map<String,Object> selProInfo(proFenye<ProInfo> fenye) {
		// TODO Auto-generated method stub
		System.out.println(fenye);
		List<ProInfo> selProInfo = proInfoDao.selProInfo(fenye);
		Integer selProInfoCount = proInfoDao.selProInfoCount(fenye);
		System.out.println(selProInfoCount);
		fenye.setRows(selProInfo);
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", selProInfo);
		map.put("count",selProInfoCount);
		return map;
	}

}
