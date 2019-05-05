package com.feng.common.constant;

import com.feng.common.bean.Val;

/**
 * 名称常量枚举类
 */
public enum Names implements Val {
    NAMESPACE("lc");

    private String name;

    private Names(String name) {
        this.name = name;
    }


    @Override
    public void setValue(Object val) {
        this.name = (String) val;
    }

    @Override
    public Object getValue() {
        return null;
    }}