package com.shcar.demob.service.impl;

import com.shcar.demob.mapper.OrderMapper;
import com.shcar.demob.mapper.SellingMapper;
import com.shcar.demob.pojo.Order;
import com.shcar.demob.service.IOrderService;
import com.shcar.demob.service.ISellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ISellingService sellingService;


    @Override
    public void add(Order order) {
        orderMapper.insert(order);
        sellingService.remove(order.getCar());
    }
}
