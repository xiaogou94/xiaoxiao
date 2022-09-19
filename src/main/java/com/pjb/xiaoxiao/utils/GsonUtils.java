package com.pjb.xiaoxiao.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.pjb.xiaoxiao.vo.User;

import java.lang.reflect.Type;

/**
 * @program: xiaoxiao
 * @description: JSON工具类
 * @author: xiao gou
 * @create: 2022-04-29 22:15
 */
public class GsonUtils {
    private static Gson gson = new GsonBuilder().create();

    public static String toJson(Object value) {
        return gson.toJson(value);
    }

    public static <T> T fromJson(String json,Class<T> classOfT) {
        return gson.fromJson(json,classOfT);
    }

    public static <T> T fromJson(String json, Type type) {
        return gson.fromJson(json,type);
    }

  public static void main(String[] args) {
    //
      User user = new User();
      user.setAge(1);
      user.setDepartId(2);
      user.setId(3);
      user.setName("xiaoxiao");

      JSONObject jsonObject = (JSONObject) JSONObject.toJSON(user);
//      System.out.println(jsonObject);
//      System.out.println(jsonObject.toString());
//      System.out.println(GsonUtils.toJson(jsonObject));
        User user1 = GsonUtils.fromJson(jsonObject.toString(),User.class);
        System.out.println(user1);
  }
}
