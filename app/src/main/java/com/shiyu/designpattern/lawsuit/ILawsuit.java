package com.shiyu.designpattern.lawsuit;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 诉讼接口类
 */

public interface ILawsuit {
    //提交申请
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();
}
