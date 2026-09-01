package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/orders", "/api/orders/*"})
public class OrderController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 订单列表、订单详情
        writeJson(response, Result.success("订单接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 创建订单、模拟支付、取消订单、发货、完成
        writeJson(response, Result.success("订单接口待实现", null));
    }
}
