package com.lee.model;

import java.io.Serializable;


public class Goods implements Serializable {

    private Integer goodsCode;
    private String goodsName;
    private String goodsType;

    private String goodsPrice;

    private String goodsDescribe;

    public Integer getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(Integer goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }


}
