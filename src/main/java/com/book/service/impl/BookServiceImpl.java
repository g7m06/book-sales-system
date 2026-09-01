package com.book.service.impl;

import com.book.common.PageResult;
import com.book.dao.BookDao;
import com.book.dao.impl.BookDaoImpl;
import com.book.entity.Book;
import com.book.service.BookService;

import java.util.Collections;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();

    @Override
    public PageResult<Book> page(String keyword, Integer categoryId, int page, int pageSize) {
        // TODO 图书分页业务
        return new PageResult<>(Collections.emptyList(), page, pageSize, 0, 0);
    }

    @Override
    public Book getById(Integer bookId) {
        // TODO 图书详情业务
        return null;
    }

    @Override
    public boolean add(Book book) {
        // TODO 新增图书业务
        return false;
    }

    @Override
    public boolean update(Book book) {
        // TODO 修改图书业务
        return false;
    }

    @Override
    public boolean adjustStock(Integer bookId, int delta) {
        // TODO 库存调整业务
        return false;
    }

    @Override
    public boolean remove(Integer bookId) {
        // TODO 删除或下架图书业务
        return false;
    }
}
