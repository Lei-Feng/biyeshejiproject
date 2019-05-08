package com.feng.rv.web.Test;

//import com.feng.rv.web.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author : feng-lei
 * @Date : 2019-05-07 下午 4:51
 * @Description :
 */
@Controller
public class test {

//    @Autowired
//    private MyDao dao;
//
//    @RequestMapping(value = "test")
//    public void testInsert() {
//        try {
//
//            String path = "F:/result.txt";
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
//            String line = null;
//            Data data = new Data();
//            while ((line = reader.readLine()) != null) {
//                String[] values = line.split("\t");
//                data.setKeyword(values[0].substring(1, values[0].length() - 1));
//                data.setCount(Integer.parseInt(values[1]));
//                int i = dao.insert(data);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
