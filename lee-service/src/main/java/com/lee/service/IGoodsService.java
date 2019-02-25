package com.lee.service;

import com.lee.model.Goods;

public interface IGoodsService {
    Goods selectGoodsByCode(Integer code);
}
