package com.wp.aop.impl;

import com.wp.aop.InvokableMethod;

/**
 * Created by 王萍 on 2017/11/11 0011.
 */
public class DefaultInvokeMethod implements InvokableMethod {
    @Override
    public Object invokeMethod() {
        System.out.println("执行默认方法。");
        return "";
    }
}
