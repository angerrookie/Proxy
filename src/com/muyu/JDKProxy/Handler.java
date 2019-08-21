package com.muyu.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Handler
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Handler implements InvocationHandler {

    private Object object;
    public Handler(Object object){
        super();
        this.object = object;
    }

    /**
     * 参数：
     *proxy 被代理的对象
     *method 被代理对象的方法
     *args 方法的参数
     *Object 方法返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("取钱");
        method.invoke(object, args);
        System.out.println("装软件");

        return null;
    }
}
