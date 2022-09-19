package com.pjb.xiaoxiao.utils;

import org.omg.CORBA.DataOutputStream;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: xiaoxiao
 * @description: Http工具类
 * @author: xiao gou
 * @create: 2022-04-29 22:18
 */
public class HttpUtil {

    public static String post(String requestUrl,String accessToken,String params) throws Exception {
      String contentType = "application/x-www-form-urlencoded";
      return HttpUtil.post1(requestUrl,accessToken,contentType,params);
    }

    private static String post1(String requestUrl, String accessToken, String contentType, String params) throws Exception {
        String encoding = "UTF-8";
        if (requestUrl.contains("nlp")) {
            encoding = "GBK";
        }
        return HttpUtil.post2(requestUrl,accessToken,contentType,params,encoding);
    }

    private static String post2(String requestUrl, String accessToken, String contentType, String params, String encoding) throws Exception {
        String url = requestUrl + "?access_token=" + accessToken;
        return HttpUtil.postGeneralUrl(url,contentType,params,encoding);
    }

    private static String postGeneralUrl(String url, String contentType, String params, String encoding) throws Exception {
        URL url1 = new URL(url);
        // 打开和URL之间的连接
        HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
        connection.setRequestMethod("POST");
        // 设置通用的属性
        connection.setRequestProperty("Content-Type",contentType);
        connection.setRequestProperty("Connection","Keep-Alive");
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);

        // 得到请求的输出流对象
//        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        return null;
    }

}
