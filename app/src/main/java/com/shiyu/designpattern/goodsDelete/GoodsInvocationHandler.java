package com.shiyu.designpattern.goodsDelete;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 动态代理
 */

public class GoodsInvocationHandler implements InvocationHandler {
    private IGoods  mIGoods;

    public GoodsInvocationHandler(IGoods mIGoods) {
        this.mIGoods = mIGoods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //删除前的一些操作
        System.out.println("动态代理方式：删除前的操作...");
        Object invoke = method.invoke(mIGoods, args);
        //删除后的一些操作
        System.out.println("动态代理方式：删除后的操作...");
        return invoke;
    }
}
