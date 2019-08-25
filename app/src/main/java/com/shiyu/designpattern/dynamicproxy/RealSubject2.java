package com.shiyu.designpattern.dynamicproxy;

/**
 * Created by ChenJunMei on 2019/8/21.
 * 定义动态代理的  真实角色
 */

public class RealSubject2 implements Subject2 {
    @Override
    public void visit() {
        //真实角色中的具体逻辑和实现
        System.out.println("我是动态代理中的 真实角色中的方法");
    }
}
