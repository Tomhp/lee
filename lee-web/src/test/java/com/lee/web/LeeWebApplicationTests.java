package com.lee.web;

import com.lee.model.Goods;
import com.lee.service.IGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeeWebApplicationTests {

    @Autowired
    private IGoodsService goodsService;

    private static final Logger logger = LoggerFactory.getLogger(LeeWebApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGoods() {

        Goods goods = goodsService.selectGoodsByCode(1);
        logger.info(goods.getGoodsDescribe());
    }
}
