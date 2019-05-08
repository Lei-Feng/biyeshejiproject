package com.feng.rv.web.controller;

import com.feng.rv.web.Base.BaseViewModel;
import com.feng.rv.web.bean.TBL_RESULT;
import com.feng.rv.web.service.TopWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:07
 * @Description :
 */

@Controller
public class TopWordController {

    @Autowired
    private TopWordService service;

    @RequestMapping(value = "gettopword", method = RequestMethod.GET)
    @ResponseBody
    public BaseViewModel getTopWord() {
        BaseViewModel vm = new BaseViewModel();
        try {

            List<TBL_RESULT> topWord = service.getTopWord();
            if (null != topWord) {
                vm.setData(topWord);
                return vm;
            } else {
                return setError(vm, true, -90001, "数据库暂无数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return setError(vm, true, -90100, e.getMessage());
        }

    }

    private BaseViewModel setError(BaseViewModel vm, boolean error, int errorCode, String errorMsg) {
        vm.setError(error);
        vm.setErrorCode(errorCode);
        vm.setErrorMsg(errorMsg);
        return vm;
    }
}
