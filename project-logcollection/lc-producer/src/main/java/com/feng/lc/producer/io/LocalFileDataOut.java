package com.feng.lc.producer.io;

import com.feng.common.bean.DataOut;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class LocalFileDataOut implements DataOut {

    private PrintWriter writer = null;


    public LocalFileDataOut(String path) {
        setPath(path);
    }

    @Override
    public void write(Object data) throws Exception {
        write(data);
    }

    @Override
    public void write(String data) throws Exception {
        writer.println(data);
        writer.flush();
    }

    @Override
    public void setPath(String path) {
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        if (null != writer) {
            writer.close();
        }
    }
}
