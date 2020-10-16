package com.shzp.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shzp.sys.entity.Coupon;
import com.shzp.sys.entity.SysFenye;
import com.shzp.sys.service.CouponService;

@Controller
@RequestMapping(value = "/cou")
public class CouponController {

	@Autowired
	private SysFenye sysFenye;
	@Autowired
	private CouponService couponService;
	@RequestMapping(value = "getCoupon",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getCoupon(Integer page,Integer limit,Coupon coupon){
		sysFenye.setPage((page-1)*limit);
		sysFenye.setLimit(limit);
		sysFenye.setCoupon(coupon);
		return couponService.getCoupon(sysFenye);
		
	}
	@RequestMapping(value = "updateCoupon",method = RequestMethod.POST)
	@ResponseBody
	public Integer updateCoupon(Coupon coupon) {
		System.out.println("数据获取"+coupon);
		return couponService.updateCoupon(coupon);
		
	}
}
