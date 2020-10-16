package com.shzp.sys.dao;

import java.util.List;

import com.shzp.sys.entity.Coupon;
import com.shzp.sys.entity.SysFenye;

public interface CouponDao {
	/**
	 * 获取优惠券信息
	 * 
	 * @param sysFenye
	 * @return
	 */
	public List<Coupon> getCoupon(SysFenye sysFenye);

	/**
	 * 统计总条数
	 * 
	 * @param sysFenye
	 * @return
	 */
	public Integer getCouponCount(SysFenye sysFenye);

	/**
	 * 更新优惠券信息
	 * @param coupon
	 * @return
	 */
	public Integer updateCoupon(Coupon coupon);

}
