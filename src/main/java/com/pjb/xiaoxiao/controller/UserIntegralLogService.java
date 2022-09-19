package com.pjb.xiaoxiao.controller;

import com.pjb.xiaoxiao.constant.RedisKeyConstant;
import com.pjb.xiaoxiao.constant.ResponseResult;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @program: xiaoxiao
 * @description: userIntegralLogService实现类
 * @author: xiao gou
 * @create: 2021-11-13 20:34
 */
public class UserIntegralLogService {

    public ResponseResult saveSign(Integer userId) {
        // 在这里是我们的公司统一返回类
        ResponseResult responseResult = new ResponseResult();
        // 用String.format拼接好单个用户位图key
        String signKey = String.format(RedisKeyConstant.USER_SIGN_IN, LocalDate.now().getYear(),userId);
        // 位图的片移点为当天的日期，如今天，偏移值就是1010
        long monthAndDay = Long.parseLong(LocalDate.now().format(DateTimeFormatter.ofPattern("MMdd")));
        responseResult.setMessage("今日已签到");
        responseResult.setCode(-1);
        return responseResult;
    }

  public static void main(String[] args) {
    System.out.println(Long.parseLong(LocalDate.now().format(DateTimeFormatter.ofPattern("MMdd"))));
  }

    /**
     * 获取连续签到的天数
     * @param userId
     * @return
     */
    private int getContinuousSignCount(Integer userId) {
        int signCount = 0;
        LocalDate date = LocalDate.now();
        return 0;
    }

}
