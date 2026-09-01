package com.book.dao;

import com.book.entity.Coupon;
import com.book.entity.UserCoupon;

import java.util.List;

public interface CouponDao {

    List<Coupon> findAvailable();

    List<UserCoupon> findUserCoupons(Integer userId);

    int insertUserCoupon(UserCoupon userCoupon);

    int markUserCouponUsed(Integer userCouponId, Integer orderId);
}
