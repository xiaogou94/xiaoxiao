package com.pjb.xiaoxiao.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: xiaoxiao
 * @description: 身份识别
 * @author: xiao gou
 * @create: 2022-04-29 21:46
 */
public class BaiDuIdentification {

    @RequestMapping(value = "getCardMessage",method = RequestMethod.POST)
    public String baiduCard(@RequestBody String file) {
//
//        String auth = BaiDu
        return null;
    }
}
