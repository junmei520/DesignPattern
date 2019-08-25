package com.shiyu.designpattern.goodsDelete;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 商品 真实类
 */

public class RealGoods implements IGoods{

    @Override
    public void delete() {
        //直接添加删除前的操作
        System.out.println("直接添加删除前操作");
        System.out.println("请求后台删除操作...");
        //直接添加删除后的操作
        System.out.println("直接添加删除后操作");
    }
}


