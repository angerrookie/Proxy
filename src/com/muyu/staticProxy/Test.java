package com.muyu.staticProxy;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

      IBuyComputer proxy = new ImProxy(new ImBuyComputer());
      proxy.buyComputer();

      ImBuyComputer proxy2 = new  Proxy2();
      proxy2.buyComputer();
    }
}
