package com.muyu.staticProxy;

/**
 * Proxy2
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Proxy2 extends ImBuyComputer{
    @Override
    public void buyComputer(){
        befor();
        super.buyComputer();
        after();
    }
    private void befor(){
        System.out.println("---去取钱----");
    }

    private void after(){
        System.out.println("------装软件------");
    }
}
