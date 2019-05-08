package com.feng.rv.web.service.impl;

import com.feng.rv.web.bean.TBL_Data;
import com.feng.rv.web.dao.DetailDAO;
import com.feng.rv.web.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:16
 * @Description :
 */

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDAO dao;

    public List<TBL_Data> getDetail() throws Exception{
        return dao.getDetail();
    }
}
