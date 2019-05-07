package com.feng.analysis.reducer;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SogouReducer extends Reducer<Text, NullWritable, Text, NullWritable> {

    @Override
    protected void reduce(Text k, Iterable<NullWritable> values,
                          Context context) throws IOException, InterruptedException {

        context.write(k, NullWritable.get());
    }
}
