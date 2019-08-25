package com.shiyu.designpattern.lawsuit;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 代理律师类
 */

public class Lawyer implements ILawsuit{
    //持有一个具体被代理者的引用
    private ILawsuit mLawsuit;

    public Lawyer(ILawsuit lawsuit){
        mLawsuit=lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
