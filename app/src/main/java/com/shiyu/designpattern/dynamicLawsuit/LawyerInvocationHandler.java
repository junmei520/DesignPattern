package com.shiyu.designpattern.dynamicLawsuit;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 动态代理 创建LawyerInvocationHandler 实现 InvocationHander接口
 */

public class LawyerInvocationHandler implements InvocationHandler {
    private Object realObj;

    public LawyerInvocationHandler(Object realObj){
        this.realObj=realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理对象的方法
        Object retObj=method.invoke(realObj,args);
        return retObj;
    }
}
