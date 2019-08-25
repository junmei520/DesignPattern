package com.shiyu.designpattern.goodsDelete;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 代理类---静态代理
 * 为了保证之前写好的商品删除部分代码不动，删除前、后需要增加的其他操作写在这个类里
 */

public class GoodsProxy implements IGoods {
    private IGoods iGoods;

    public GoodsProxy(IGoods iGoods) {
        this.iGoods = iGoods;
    }

    @Override
    public void delete() {
        //在这增加做删除前的一些操作
        System.out.println("删除前的一些操作...");
        iGoods.delete();
        //在这增加删除后的一些操作
        System.out.println("删除后的一些操作...");
    }
}

