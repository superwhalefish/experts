package com.shzp.product.service;

import java.util.List;
import java.util.Map;

import com.shzp.product.entity.proFenye;
import com.shzp.product.entity.ProInfo;

public interface ProInfoService {
	Map<String, Object> selProInfo(proFenye<ProInfo> profenye);
}
