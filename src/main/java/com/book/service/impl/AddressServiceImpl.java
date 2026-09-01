package com.book.service.impl;

import com.book.dao.AddressDao;
import com.book.dao.impl.AddressDaoImpl;
import com.book.entity.ReceiverAddress;
import com.book.service.AddressService;

import java.util.Collections;
import java.util.List;

public class AddressServiceImpl implements AddressService {

    private final AddressDao addressDao = new AddressDaoImpl();

    @Override
    public List<ReceiverAddress> list(Integer userId) {
        // TODO 收货地址列表业务
        return Collections.emptyList();
    }

    @Override
    public boolean add(ReceiverAddress address) {
        // TODO 新增收货地址业务
        return false;
    }

    @Override
    public boolean update(ReceiverAddress address) {
        // TODO 修改收货地址业务
        return false;
    }

    @Override
    public boolean remove(Integer addressId, Integer userId) {
        // TODO 删除收货地址业务
        return false;
    }

    @Override
    public boolean setDefault(Integer addressId, Integer userId) {
        // TODO 设置默认收货地址业务
        return false;
    }
}
