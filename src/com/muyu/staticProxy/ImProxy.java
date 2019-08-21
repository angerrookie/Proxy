package com.muyu.staticProxy;

/**
 * ImProxy
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class ImProxy implements IBuyComputer {

    private IBuyComputer buyComputer;

    public ImProxy(IBuyComputer buyComputer){

        this.buyComputer = buyComputer;
    }

    private void befor(){
        System.out.println("---去取钱----");
    }

    private void after(){
        System.out.println("------装软件------");
    }

    @Override
    public void buyComputer() {

        befor();
        buyComputer.buyComputer();
        after();
    }
}
