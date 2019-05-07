package com.feng.analysis;

import java.io.IOException;

import com.feng.analysis.mapper.SogouMapper;
import com.feng.analysis.reducer.SogouReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AnalysisData {
    public static void main(String[] args) {
        try {

            Configuration conf = new Configuration();
            Job job = Job.getInstance(conf );

            job.setJarByClass(AnalysisData.class);

            job.setMapperClass(SogouMapper.class);
            job.setReducerClass(SogouReducer.class);

            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(NullWritable.class);

            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(NullWritable.class);

            FileInputFormat.setInputPaths(job, new Path("hdfs://192.168.233.121:9000/biyesheji/input"));
            //FileOutputFormat.setOutputPath(job, new Path("F:/output/"));
            FileOutputFormat.setOutputPath(job, new Path("hdfs://192.168.233.121:9000/biyesheji/output/"));
            boolean ret = job.waitForCompletion(true);
            System.exit(ret ? 0 : 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
