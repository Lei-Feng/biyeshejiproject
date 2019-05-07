package com.feng.analysis.mapper;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class SogouMapper  extends Mapper<LongWritable, Text, Text, NullWritable>{
    Text k = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException {

        // 00:00:00 2982199073774412 [360安全卫士] 8 3 download.it.com.cn/softweb/software/firewall/antivirus/20067/17938.html

        //String line = new String(value.getBytes(), 0, value.getLength(), "GBK");
        String line = value.toString();
        String[] words = line.split("\\p{Blank}");

        String result = new String();
        result = words[0] + "," + words[1] + "," + words[2] + "," + words[5];

        k.set(result);
        context.write(k, NullWritable.get());
    }

}
