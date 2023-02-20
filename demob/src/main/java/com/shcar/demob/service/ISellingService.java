package com.shcar.demob.service;


import com.shcar.demob.pojo.Selling;

import java.util.List;

public interface ISellingService {
    void listing(Selling selling);

    void remove(Integer id);

    List<Selling> all();

}
