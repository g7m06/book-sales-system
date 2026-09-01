package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/admin/*"})
public class AdminController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 管理员查询图书、订单、会员
        writeJson(response, Result.success("管理员接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 管理员维护图书、处理订单、管理会员
        writeJson(response, Result.success("管理员接口待实现", null));
    }
}
