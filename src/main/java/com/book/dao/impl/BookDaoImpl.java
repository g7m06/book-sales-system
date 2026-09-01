package com.book.dao.impl;

import com.book.dao.BookDao;
import com.book.entity.Book;

import java.util.Collections;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> findByCondition(String keyword, Integer categoryId, int page, int pageSize) {
        // TODO 图书分页查询
        return Collections.emptyList();
    }

    @Override
    public Book findById(Integer bookId) {
        // TODO 按编号查询图书
        return null;
    }

    @Override
    public int insert(Book book) {
        // TODO 新增图书
        return 0;
    }

    @Override
    public int update(Book book) {
        // TODO 修改图书
        return 0;
    }

    @Override
    public int updateStock(Integer bookId, int delta) {
        // TODO 调整库存
        return 0;
    }

    @Override
    public int deleteById(Integer bookId) {
        // TODO 删除图书
        return 0;
    }
}
