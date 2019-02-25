package com.lee.web.controller;

import com.lee.model.Goods;
import com.lee.service.IGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @RequestMapping(value = "getGoods/{code}", method = RequestMethod.POST)
    public Object getGoodsByCode(@PathVariable("code") Integer code) {

        Goods goods = goodsService.selectGoodsByCode(code);
        return goods;
    }
}
