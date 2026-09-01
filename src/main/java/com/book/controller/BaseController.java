package com.book.controller;

import com.book.util.JsonUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseController extends HttpServlet {

    protected void writeJson(HttpServletResponse response, Object data) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(JsonUtil.toJson(data));
    }
}
