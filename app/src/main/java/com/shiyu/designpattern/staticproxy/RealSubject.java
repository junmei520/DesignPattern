package com.shiyu.designpattern.staticproxy;

/**
 * Created by ChenJunMei on 2019/8/21.
 * 定义静态代理的  真实角色
 */

public class RealSubject extends Subject {
    @Override
    public void visit() {
        //真实角色中的具体逻辑和实现
        System.out.println("我是静态代理中的 真实角色 的具体方法");
    }
}
