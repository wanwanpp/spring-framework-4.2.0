package com.wp.aop;

/**
 * Created by 王萍 on 2017/11/11 0011.
 */
public class TimeMonitorHandler {

    private long before;

    public void before() {
        before = System.currentTimeMillis();
        System.out.println("CurrentTime:" + before);
    }

    public void after() {
        System.out.println("CurrentTime:" + System.currentTimeMillis());
        System.out.println("执行方法共用时："+(System.currentTimeMillis()-before));
    }
}
