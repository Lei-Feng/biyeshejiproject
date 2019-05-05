package com.feng.common.bean;


import java.io.Closeable;

public interface DataOut extends Closeable {
    void setPath(String path);

    void write(Object data) throws Exception;
    void write(String data) throws Exception;


}
