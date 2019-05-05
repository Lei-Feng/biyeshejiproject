package com.feng.lc.producer;

import com.feng.common.bean.Producer;
import com.feng.lc.producer.bean.LocalFileProducer;
import com.feng.lc.producer.io.LocalFileDataIn;
import com.feng.lc.producer.io.LocalFileDataOut;

public class BootStrap {

    public static void main(String[] args) throws Exception{

        // 构建生产者对象
        Producer producer = new LocalFileProducer();
        producer.setIn(new LocalFileDataIn(""));
        producer.setOut(new LocalFileDataOut(""));

        // 生产数据
        producer.produce();

        // 关闭生产者
        producer.close();


    }
}
