package com.muyu.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIBProxy
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class CGLIBProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class<?> cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    /**
     * 拦截所有目标类方法的调用
     * 参数：
     * obj  目标实例对象
     * method 目标方法的反射对象
     * args 方法的参数
     * proxy 代理类的实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("取钱");
        methodProxy.invokeSuper(o, objects);
        System.out.println("装软件");

        return null;
    }
}
