package com.shzp.sys.service;

import java.util.Map;

import com.shzp.sys.entity.Coupon;
import com.shzp.sys.entity.SysFenye;

public interface CouponService {
	/**
	 * 获取优惠券信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	public Map<String, Object> getCoupon(SysFenye sysFenye);

	/**
	 * 更新优惠券信息
	 * 
	 * @param coupon
	 * @return
	 */
	public Integer updateCoupon(Coupon coupon);

}
