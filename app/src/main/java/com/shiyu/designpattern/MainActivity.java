package com.shiyu.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shiyu.designpattern.dynamicLawsuit.LawyerInvocationHandler;
import com.shiyu.designpattern.dynamicproxy.MyInvocationHandler;
import com.shiyu.designpattern.dynamicproxy.RealSubject2;
import com.shiyu.designpattern.dynamicproxy.Subject2;
import com.shiyu.designpattern.goodsDelete.GoodsInvocationHandler;
import com.shiyu.designpattern.goodsDelete.GoodsProxy;
import com.shiyu.designpattern.goodsDelete.IGoods;
import com.shiyu.designpattern.goodsDelete.RealGoods;
import com.shiyu.designpattern.lawsuit.ILawsuit;
import com.shiyu.designpattern.lawsuit.Lawyer;
import com.shiyu.designpattern.lawsuit.XiaoMin;
import com.shiyu.designpattern.staticproxy.ProxySubject;
import com.shiyu.designpattern.staticproxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试静态代理的使用
        RealSubject real=new RealSubject();//构造一个真实角色
        ProxySubject proxy=new ProxySubject(real); //通过真实对象构造一个代理对象
        proxy.visit(); //调用代理的相关方法

        //测试动态代理的使用
        RealSubject2 real2 = new RealSubject2();
        InvocationHandler invocationHandler = new MyInvocationHandler(real2);
        Subject2 dynamicProxy = (Subject2) Proxy.newProxyInstance(RealSubject2.class.getClassLoader(), new Class[]{Subject2.class}, invocationHandler);
        dynamicProxy.visit();

        //测试小民诉讼
        ILawsuit xiaomin=new XiaoMin();//构造一个小民
        ILawsuit lawyer=new Lawyer(xiaomin);//构造一个代理律师并将小民作为构造参数传递进去
        lawyer.submit();//律师提交诉讼
        lawyer.burden();//律师进行举证
        lawyer.defend();//律师代替小民进行辩护
        lawyer.finish();//完成诉讼

        //测试动态代理方式 小民诉讼
        ILawsuit xiaomin2=new XiaoMin();//构造一个小民
        LawyerInvocationHandler lawyerInvocationHandler=new LawyerInvocationHandler(xiaomin2);//创建一个InvocationHandler
        ClassLoader loader=xiaomin2.getClass().getClassLoader();//获取被代理类xiaomin2的ClassLoader
        //动态构造一个代理律师
        ILawsuit dynamicLawyer= (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},lawyerInvocationHandler);
        dynamicLawyer.submit();
        dynamicLawyer.burden();
        dynamicLawyer.defend();
        dynamicLawyer.finish();

        //测试静态代理 实现删除功能
        GoodsProxy goodsProxy = new GoodsProxy(new RealGoods());
        goodsProxy.delete();

        //测试动态代理 实现删除功能
        RealGoods goods = new RealGoods();//构造一个商品真实类
        GoodsInvocationHandler goodsInvocationHandler = new GoodsInvocationHandler(goods);//构造一个InvocationHandler
        IGoods goodsDynacmicProxy = (IGoods) Proxy.newProxyInstance(goods.getClass().getClassLoader(), goods.getClass().getInterfaces(), goodsInvocationHandler);//动态生成一个代理类
        goodsDynacmicProxy.delete();//通过动态代理对象调用删除方法
    }
}
