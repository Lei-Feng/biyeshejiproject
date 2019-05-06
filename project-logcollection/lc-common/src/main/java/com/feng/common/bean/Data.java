package com.feng.common.bean;

/**
 * 数据对象
 */
public abstract class Data implements Val {

    public String content;

    public void setValue(Object val) {
        this.content = (String) val;
    }

    public Object getValue() {
        return content;
    }
}
