package com.shzp.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.product.dao.ProInfoDao;
import com.shzp.product.entity.proFenye;
import com.shzp.product.entity.ProInfo;
import com.shzp.product.service.ProInfoService;

@Controller
@RequestMapping("/pro")
@CrossOrigin
public class ProInfoController {
	
	@Autowired
	private ProInfoService proInfoService;
	@Autowired
	private proFenye<ProInfo> profenye;
	
	@RequestMapping(value="/info",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selProinfo(int page,int limit,ProInfo proinfo){
		profenye.setPage((page-1)*limit);
		profenye.setLimit(limit);
		profenye.setT(proinfo);
		return proInfoService.selProInfo(profenye);
	}
	
}
