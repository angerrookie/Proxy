package com.muyu.JDKProxy;

/**
 * ImBuyComputer
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:真实业务类
 */
public class ImBuyComputer implements IBuyComputer {
    @Override
    public void buyComputer() {
        System.out.println("buy computer");
    }
}
