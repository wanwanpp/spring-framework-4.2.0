package com.wp.annotation;

/**
 * @author 王萍
 * @date 2017/12/20 0020
 */
public class Animal {
    public Animal() {
    }

    public Animal(String kind, int nums) {
        this.kind = kind;
        this.nums = nums;
    }

    private String kind;
    private int nums;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}
