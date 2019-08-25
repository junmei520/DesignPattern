package com.shiyu.designpattern.staticproxy;

/**
 * Created by ChenJunMei on 2019/8/21.
 * 定义静态代理中的 代理类
 */

public class ProxySubject extends Subject{
    private RealSubject mSubject;//持有真实对象的引用

    public ProxySubject(RealSubject mSubject){
        this.mSubject=mSubject;
    }

    @Override
    public void visit(){
        //在真实对象方法前 添加一些操作
        System.out.println("添加一些 之前操作");

        //通过真实角色对象的引用 调用真实角色中的逻辑方法
        mSubject.visit();

        //在真实对象方法后 添加一些操作
        System.out.println("添加一些 之前操作");

    }
}
