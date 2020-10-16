package com.shzp.sys.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shzp.sys.dao.CouponDao;
import com.shzp.sys.entity.Coupon;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponDao couponDao;

	@Override
	public Map<String, Object> getCoupon(SysFenye sysFenye) {
		// TODO Auto-generated method stub
		List<Coupon> cList=couponDao.getCoupon(sysFenye);
		Integer c=couponDao.getCouponCount(sysFenye);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "");
		map.put("code", 0);
		map.put("count", c);
		map.put("data", cList);
		return map;
	}

	@Override
	public Integer updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponDao.updateCoupon(coupon);
	}

}
