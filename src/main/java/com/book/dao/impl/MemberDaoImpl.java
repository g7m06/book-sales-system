package com.book.dao.impl;

import com.book.dao.MemberDao;
import com.book.entity.Member;

import java.util.Collections;
import java.util.List;

public class MemberDaoImpl implements MemberDao {

    @Override
    public Member findByUsername(String username) {
        // TODO 按用户名查询会员
        return null;
    }

    @Override
    public Member findById(Integer userId) {
        // TODO 按编号查询会员
        return null;
    }

    @Override
    public int insert(Member member) {
        // TODO 新增会员
        return 0;
    }

    @Override
    public int updateProfile(Member member) {
        // TODO 修改会员资料
        return 0;
    }

    @Override
    public int updatePoints(Integer userId, int delta) {
        // TODO 更新会员积分
        return 0;
    }

    @Override
    public int updateStatus(Integer userId, int status) {
        // TODO 禁用或启用会员
        return 0;
    }

    @Override
    public List<Member> findByCondition(String keyword, int page, int pageSize) {
        // TODO 会员分页查询
        return Collections.emptyList();
    }
}
