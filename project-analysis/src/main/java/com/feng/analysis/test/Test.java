package com.feng.analysis.test;

import com.feng.common.bean.Data;
import com.feng.common.utils.JDBCUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;

/**
 * @author : feng-lei
 * @Date : 2019-05-07 下午 5:17
 * @Description :
 */

public class Test {

    public static void main(String[] args) {
        new Test().write();
    }


    public void write () {
        try {
            String sql = "insert into tbl_result(keyword, count) values (?, ?)";

            String path = "F:/result.txt";
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line = null;
            MyData data = new MyData();
            PreparedStatement pst = JDBCUtils.getConnection().prepareStatement(sql);
            int i = 20000;
            while ((line = reader.readLine()) != null) {
                if (i <= 0) {
                    break;
                }
                String[] values = line.split("\t");
                data.setKeyword(values[0]);
                data.setCount(Integer.parseInt(values[1]));
                pst.setString(1, data.getKeyword());
                pst.setInt(2, data.getCount() );
                pst.execute();
                i --;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public void write2 () {
        try {
            String sql = "insert into tbl_data(qtime, qid, qword, url) values (?, ?, ?, ?)";

            String path = "F:/sogou.txt";
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line = null;
            MyData2 data = new MyData2();
            PreparedStatement pst = JDBCUtils.getConnection().prepareStatement(sql);
            int i = 20000;
            while ((line = reader.readLine()) != null) {
                if (i <= 0) {
                    break;
                }
                String[] values = line.split("\t");
                data.setQtime(values[0]);
                data.setQid(values[1]);
                data.setQword(values[2]);
                data.setUrl(values[3]);
                pst.setString(1, data.getQtime());
                pst.setString(2, data.getQid());
                pst.setString(3, data.getQword());
                pst.setString(4, data.getUrl());

                pst.execute();
                i --;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
