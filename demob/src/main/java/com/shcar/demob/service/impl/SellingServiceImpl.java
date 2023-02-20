package com.shcar.demob.service.impl;

import com.shcar.demob.mapper.SellingMapper;
import com.shcar.demob.mapper.UserMapper;
import com.shcar.demob.service.ISellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shcar.demob.pojo.Selling;

import java.util.List;

@Service
public class SellingServiceImpl implements ISellingService {
    @Autowired
    private SellingMapper sellingMapper;


    @Override
    public void listing(Selling selling) {
        sellingMapper.insert(selling);
    }

    @Override
    public void remove(Integer id) {
        Selling selling = new Selling();
        selling.setId((long)id);
        selling.setState(1);

        sellingMapper.updateById(selling);
    }

    @Override
    public List<Selling> all() {
        return sellingMapper.selectList(null);
    }
}
