package com.shiyu.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ChenJunMei on 2019/8/21.
 */

public class MyInvocationHandler implements InvocationHandler {
    private Object obj;//真实角色的引用

    public MyInvocationHandler(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理对象的方法
        Object result=method.invoke(obj,args);
        return result;
    }
}
