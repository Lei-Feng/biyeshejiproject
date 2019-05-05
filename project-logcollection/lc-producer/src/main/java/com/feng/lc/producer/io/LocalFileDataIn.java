package com.feng.lc.producer.io;

import com.feng.common.bean.Data;
import com.feng.common.bean.DataIn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LocalFileDataIn implements DataIn {

    private BufferedReader reader = null;

    public LocalFileDataIn(String path) {
        setPath(path);
    }

    @Override
    public void setPath(String path) {
        try {

            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object read() throws IOException {
        return null;
    }

    /**
     * 读取数据 封装返回集合
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    @Override
    public <T extends Data> List<T> read(Class<T> clazz) throws IOException {
        List<T> ts = new ArrayList<>();

        try {

            // 从文件中 读取所有数据
            String line = null;
            while ((line = reader.readLine()) != null) {
                // 然后将数据转换为制定类型的对象 封装为集合返回

                T t = clazz.newInstance();
                t.setValue(line);
                ts.add(t);

            }
        } catch (Exception e) {

        }

        return null;
    }

    /**
     * 关闭资源
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        if (null != reader) {
            reader.close();
        }
    }
}
