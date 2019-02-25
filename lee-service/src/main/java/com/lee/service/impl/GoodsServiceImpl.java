package com.lee.service.impl;

import com.lee.dao.GoodsMapper;
import com.lee.model.Goods;
import com.lee.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods selectGoodsByCode(Integer code) {
        return goodsMapper.selectGoodsByCode(code);
    }
}
