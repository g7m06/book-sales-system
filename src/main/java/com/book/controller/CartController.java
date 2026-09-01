package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/cart", "/api/cart/*"})
public class CartController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 购物车列表
        writeJson(response, Result.success("购物车接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 加入购物车、修改数量、删除、清空
        writeJson(response, Result.success("购物车接口待实现", null));
    }
}
