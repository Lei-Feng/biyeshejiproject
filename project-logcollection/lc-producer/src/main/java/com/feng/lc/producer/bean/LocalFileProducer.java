package com.feng.lc.producer.bean;

import com.feng.common.bean.DataIn;
import com.feng.common.bean.DataOut;
import com.feng.common.bean.Producer;

import java.io.IOException;
import java.util.List;

/**
 * 数据文件的生产者
 */

public class LocalFileProducer implements Producer {

    private DataIn in;
    private DataOut out;

    private volatile boolean falg = true;

    @Override
    public void setIn(DataIn in) {
        this.in = in;
    }

    @Override
    public void setOut(DataOut out) {
        this.out = out;
    }

    /**
     * 生产数据
     */
    @Override
    public void produce() {
        try {

            in.read();
            // 读取数据
            while (falg) {
                // 从数据中获取数据
                List<MyDataLog> result = in.read(MyDataLog.class);
                for (MyDataLog log : result) {
                    System.out.println(log);
                }


                // 生成随机数据

                // 将数据写到文件中
                out.write(null);

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 关闭生产者
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        if (null != in) {
            in.close();
        }
        if (null != out) {
            out.close();
        }
    }
}
