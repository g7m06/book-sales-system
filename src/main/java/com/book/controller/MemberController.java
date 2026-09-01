package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/member", "/api/member/*"})
public class MemberController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 会员信息、积分明细
        writeJson(response, Result.success("会员接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 注册、登录、退出、修改资料、积分更新
        writeJson(response, Result.success("会员接口待实现", null));
    }
}
