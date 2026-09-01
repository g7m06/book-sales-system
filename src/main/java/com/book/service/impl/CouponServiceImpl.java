package com.book.service.impl;

import com.book.dao.CouponDao;
import com.book.dao.impl.CouponDaoImpl;
import com.book.entity.Coupon;
import com.book.entity.UserCoupon;
import com.book.service.CouponService;

import java.util.Collections;
import java.util.List;

public class CouponServiceImpl implements CouponService {

    private final CouponDao couponDao = new CouponDaoImpl();

    @Override
    public List<Coupon> available() {
        // TODO 可领取优惠券业务
        return Collections.emptyList();
    }

    @Override
    public List<UserCoupon> myCoupons(Integer userId) {
        // TODO 我的优惠券业务
        return Collections.emptyList();
    }

    @Override
    public boolean receive(Integer userId, Integer couponId) {
        // TODO 领取优惠券业务
        return false;
    }

    @Override
    public boolean use(Integer userCouponId, Integer orderId) {
        // TODO 使用优惠券业务
        return false;
    }
}
