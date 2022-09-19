package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 查找公共字符串
 * @author: xiao gou
 * @create: 2022-06-11 09:33
 */
public class ChaZhaoGongGong {
  public static void main(String[] args) {
    //
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
          String str1 = sc.next();
          String str2 = sc.next();
          //保证第一个参数为较短串
          if(str1.length()<str2.length()){
              System.out.println(test(str1,str2));
          }else {
              System.out.println(test(str2,str1));
          }

      }
  }

  // 求最长公共子串，str1为较短串
    private static String test(String str1, String str2) {
         // 如果str1为str2子串,直接返回
        if (str2.contains(str1)) {
            return str1;
        }

        int len = str1.length() - 1;// 记录最长的公共子串长度
    for (int i = 0; i < str1.length(); i++) {
      //
        if (len == 0) {
            break;
        }
        if (i + len <= str1.length()) {
            // 在str1中截取长度len的子串，如果是str2的子串则返回
            String s = str1.substring(i,i+len);
            if (str2.contains(s)) {
                return s;
            }
        }else {
            len--;
            i= -1;
        }
    }
    return null;
    }
}
