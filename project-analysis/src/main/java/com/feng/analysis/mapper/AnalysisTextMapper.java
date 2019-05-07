package com.feng.analysis.mapper;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.Text;

import java.io.IOException;

public class AnalysisTextMapper extends TableMapper<Text, Text> {

    @Override
    protected void map(ImmutableBytesWritable key, Result value, Context context) throws IOException, InterruptedException {
        // 00:00:00	2982199073774412	[360安全卫士]	8 3	download.it.com.cn/softweb/software/firewall/antivirus/20067/17938.html
        //00:00:00	07594220010824798	[哄抢救灾物资]	1 1	news.21cn.com/social/daqian/2008/05/29/4777194_1.shtml
        String rowkey = Bytes.toString(key.get());

        String[] values = rowkey.split("\t");



        super.map(key, value, context);
    }
}
