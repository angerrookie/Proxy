package com.muyu.CGLIBProxy;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        CGLIBProxy proxy = new CGLIBProxy();
        IBuyComputer buyComputer = (IBuyComputer) proxy.getProxy(IBuyComputer.class);
        buyComputer.buyComputer();
    }
}
