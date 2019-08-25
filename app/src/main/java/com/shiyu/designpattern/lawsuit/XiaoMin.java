package com.shiyu.designpattern.lawsuit;

/**
 * Created by ChenJunMei on 2019/8/23.
 * 具体诉讼人---小民
 */

public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        //老板欠小民工资，小民只好申请仲裁
        System.out.println("老板拖欠工资，特此申请仲裁！");
    }

    @Override
    public void burden() {
        //小民证据充足，不怕告不赢
        System.out.println("这是合同书和过去一年的银行工资流水！");
    }

    @Override
    public void defend() {
        //铁证如山，没什么好说的
        System.out.println("证据确凿，我没必要多说什么了！");
    }

    @Override
    public void finish() {
        //结果肯定是必赢
        System.out.println("诉讼成功！判决老板七天内结算工资");
    }
}
