package com.shiyu.designpattern.staticproxy;

/**
 * Created by ChenJunMei on 2019/8/21.
 * 声明静态代理的  抽象主题类---可以是抽象类 也可以是接口
 */

public abstract class Subject {
    /**
     * 一个普通的业务方法
     */
    public abstract void visit();
}
