package com.feng.rv.web.service.impl;

import com.feng.rv.web.bean.TBL_RESULT;
import com.feng.rv.web.dao.TopWordDAO;
import com.feng.rv.web.service.TopWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:08
 * @Description :
 */
@Service
public class TopWordServiceImpl implements TopWordService {

    @Autowired
    private TopWordDAO dao;

    public List<TBL_RESULT> getTopWord() throws Exception{
        return dao.selectTopWord();
    }
}
