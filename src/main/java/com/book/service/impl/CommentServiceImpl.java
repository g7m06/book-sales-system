package com.book.service.impl;

import com.book.dao.CommentDao;
import com.book.dao.impl.CommentDaoImpl;
import com.book.entity.BookComment;
import com.book.service.CommentService;

import java.util.Collections;
import java.util.List;

public class CommentServiceImpl implements CommentService {

    private final CommentDao commentDao = new CommentDaoImpl();

    @Override
    public List<BookComment> listByBook(Integer bookId) {
        // TODO 图书评论列表业务
        return Collections.emptyList();
    }

    @Override
    public List<BookComment> listByUser(Integer userId) {
        // TODO 会员评论列表业务
        return Collections.emptyList();
    }

    @Override
    public boolean add(BookComment comment) {
        // TODO 发表评论业务
        return false;
    }

    @Override
    public boolean remove(Integer commentId) {
        // TODO 删除评论业务
        return false;
    }
}
