package com.book.service.impl;

import com.book.common.PageResult;
import com.book.dao.MemberDao;
import com.book.dao.impl.MemberDaoImpl;
import com.book.entity.Member;
import com.book.service.MemberService;

import java.util.Collections;

public class MemberServiceImpl implements MemberService {

    private final MemberDao memberDao = new MemberDaoImpl();

    @Override
    public Member login(String username, String password) {
        // TODO 登录业务
        return null;
    }

    @Override
    public boolean register(Member member) {
        // TODO 注册业务
        return false;
    }

    @Override
    public Member getById(Integer userId) {
        // TODO 查询会员业务
        return null;
    }

    @Override
    public boolean updateProfile(Member member) {
        // TODO 修改资料业务
        return false;
    }

    @Override
    public boolean updatePoints(Integer userId, int delta, String type) {
        // TODO 积分更新业务
        return false;
    }

    @Override
    public PageResult<Member> page(String keyword, int page, int pageSize) {
        // TODO 会员分页业务
        return new PageResult<>(Collections.emptyList(), page, pageSize, 0, 0);
    }

    @Override
    public boolean setStatus(Integer userId, int status) {
        // TODO 禁用或启用会员业务
        return false;
    }
}
