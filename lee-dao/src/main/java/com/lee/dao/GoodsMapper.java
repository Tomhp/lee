package com.lee.dao;


import com.lee.model.Goods;

public interface GoodsMapper {

    Goods selectGoodsByCode(Integer code);

}
