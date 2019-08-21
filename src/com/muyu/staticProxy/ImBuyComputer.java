package com.muyu.staticProxy;

/**
 * ImBuyComputer
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class ImBuyComputer implements IBuyComputer {
    @Override
    public void buyComputer() {
        System.out.println("buy computer");
    }
}
