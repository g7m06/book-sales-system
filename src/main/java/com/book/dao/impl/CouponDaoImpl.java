package com.book.dao.impl;

import com.book.dao.CouponDao;
import com.book.entity.Coupon;
import com.book.entity.UserCoupon;

import java.util.Collections;
import java.util.List;

public class CouponDaoImpl implements CouponDao {

    @Override
    public List<Coupon> findAvailable() {
        // TODO 查询可领取优惠券
        return Collections.emptyList();
    }

    @Override
    public List<UserCoupon> findUserCoupons(Integer userId) {
        // TODO 查询会员已领取优惠券
        return Collections.emptyList();
    }

    @Override
    public int insertUserCoupon(UserCoupon userCoupon) {
        // TODO 领取优惠券
        return 0;
    }

    @Override
    public int markUserCouponUsed(Integer userCouponId, Integer orderId) {
        // TODO 标记优惠券已使用
        return 0;
    }
}
