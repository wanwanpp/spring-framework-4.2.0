package com.wp.aop;

import org.aopalliance.aop.Advice;

/**
 * @author 王萍
 * @date 2018/3/4 0004
 */
public class DefaultBeforeAdvice implements Advice {

    public void before(){
        System.out.println("in DefaultBeforeAdvice!!!!");
    }
}
