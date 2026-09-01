package com.book.service;

import com.book.entity.Coupon;
import com.book.entity.UserCoupon;

import java.util.List;

public interface CouponService {

    List<Coupon> available();

    List<UserCoupon> myCoupons(Integer userId);

    boolean receive(Integer userId, Integer couponId);

    boolean use(Integer userCouponId, Integer orderId);
}
