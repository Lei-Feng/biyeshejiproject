package com.feng.common.constant;

import com.feng.common.bean.Val;

/**
 * 名称常量枚举类
 */
public enum Names implements Val {
    NAMESPACE("lc")
    ,TABLE("lc:calllog")
    ,CF_CALLER("caller")
    ,CF_CALLEE("callee")
    ,CF_INFO("info")
    ,TOPIC("lc");;

    private String name;

    private Names(String name) {
        this.name = name;
    }

    public void setValue(Object val) {
        this.name = (String) val;
    }

    public Object getValue() {
        return null;
    }}
