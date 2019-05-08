package com.feng.rv.web.dao;

import com.feng.rv.web.bean.TBL_RESULT;

import java.util.List;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:08
 * @Description :
 */

public interface TopWordDAO {

    List<TBL_RESULT> selectTopWord();
}
