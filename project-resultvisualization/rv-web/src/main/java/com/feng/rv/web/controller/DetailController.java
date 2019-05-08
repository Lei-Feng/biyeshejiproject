package com.feng.rv.web.controller;

import com.feng.rv.web.Base.BaseViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : feng-lei
 * @Date : 2019-05-08 上午 10:14
 * @Description :
 */
@Controller
public class DetailController {

    @RequestMapping(value = "getdetail", method = RequestMethod.GET)
    @ResponseBody
    public BaseViewModel getDetail() {
        BaseViewModel vm = new BaseViewModel();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return vm;
    }
}
