package com.book.dao.impl;

import com.book.dao.CommentDao;
import com.book.entity.BookComment;

import java.util.Collections;
import java.util.List;

public class CommentDaoImpl implements CommentDao {

    @Override
    public List<BookComment> findByBookId(Integer bookId) {
        // TODO 查询图书评论
        return Collections.emptyList();
    }

    @Override
    public List<BookComment> findByUserId(Integer userId) {
        // TODO 查询会员发表的评论
        return Collections.emptyList();
    }

    @Override
    public int insert(BookComment comment) {
        // TODO 新增评论
        return 0;
    }

    @Override
    public int deleteById(Integer commentId) {
        // TODO 删除评论
        return 0;
    }
}
