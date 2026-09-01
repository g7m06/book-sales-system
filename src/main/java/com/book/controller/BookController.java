package com.book.controller;

import com.book.common.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api/books", "/api/books/*"})
public class BookController extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 图书分页查询、详情查询
        writeJson(response, Result.success("图书接口待实现", null));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO 新增、修改、下架、库存调整
        writeJson(response, Result.success("图书接口待实现", null));
    }
}
