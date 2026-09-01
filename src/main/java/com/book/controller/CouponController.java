package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/coupons", "/api/coupons/*"})
public class CouponController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 可领取优惠券、我的优惠券
        writeJson(response, Result.success("优惠券接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 领取优惠券、使用优惠券
        writeJson(response, Result.success("优惠券接口待实现", null));
    }
}
