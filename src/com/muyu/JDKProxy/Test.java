package com.muyu.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        ImBuyComputer buyComputer = new ImBuyComputer();
        InvocationHandler in = new Handler(buyComputer);
        Class<?> cls = buyComputer.getClass();

        /**
         *loader 类加载器
         *interfaces 实现接口
         *h InvocationHandler
         */
        IBuyComputer iBuyComputer = (IBuyComputer) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), in);
        iBuyComputer.buyComputer();
    }
}
