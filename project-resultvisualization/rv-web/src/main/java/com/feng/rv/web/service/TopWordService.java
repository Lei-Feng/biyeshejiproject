package com.feng.rv.web.service;

import com.feng.rv.web.bean.TBL_RESULT;

import java.util.List;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:07
 * @Description :
 */

public interface TopWordService {
    List<TBL_RESULT> getTopWord() throws Exception;
}
