package com.pjb.xiaoxiao.constant;

/**
 * @program: xiaoxiao
 * @description: redis常量值
 * @author: xiao gou
 * @create: 2021-11-13 11:25
 */
public class RedisKeyConstant {

    // 人员签到位图key,一个位图存一个用户一年的用户签到状态，以userSign为标识,后面的两个参数是今年的年份和用户的id
    public final static String USER_SIGN_IN = "userSign:%d:%d";
    // 人员补签key,一个Hash列表存用户一个月的补签状态,以userSign:retroactive为标识,后面的两个参数是当月的月份和用户的id
    public final static String USER_RETROACTIVE_SIGN_IN = "userSign:retroactive:%d:%d";
    // 人员签到的总天数key,以userSign:count为标识，后面的参数是用户id
    public final static String USER_SIGN_IN_COUNT = "userSign:count:%d";
}
