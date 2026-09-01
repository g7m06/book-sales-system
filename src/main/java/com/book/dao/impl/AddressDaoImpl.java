package com.book.dao.impl;

import com.book.dao.AddressDao;
import com.book.entity.ReceiverAddress;

import java.util.Collections;
import java.util.List;

public class AddressDaoImpl implements AddressDao {

    @Override
    public List<ReceiverAddress> findByUserId(Integer userId) {
        // TODO 查询会员收货地址
        return Collections.emptyList();
    }

    @Override
    public ReceiverAddress findById(Integer addressId) {
        // TODO 查询收货地址详情
        return null;
    }

    @Override
    public int insert(ReceiverAddress address) {
        // TODO 新增收货地址
        return 0;
    }

    @Override
    public int update(ReceiverAddress address) {
        // TODO 修改收货地址
        return 0;
    }

    @Override
    public int deleteById(Integer addressId) {
        // TODO 删除收货地址
        return 0;
    }

    @Override
    public int setDefault(Integer addressId, Integer userId) {
        // TODO 设置默认收货地址
        return 0;
    }
}
