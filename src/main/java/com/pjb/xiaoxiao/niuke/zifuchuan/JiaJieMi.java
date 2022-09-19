package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 字符串加解密
 * @author: xiao gou
 * @create: 2022-06-03 16:50
 */
public class JiaJieMi {
  public static void main(String[] args) {
    //
    //    Scanner in = new Scanner(System.in);
    //    while (in.hasNext()) {
    //      System.out.println(encode(in.nextLine()));
    //      System.out.println(decode(in.nextLine()));
    //    }
    System.out.println("转换前：" + 'a');
    System.out.println("转换后：" + (char)('a' - 32 + 1));
  }

    private static String decode(String password){
        char[] t = password.toCharArray();
        for(int i=0; i < t.length; i++){
            if(t[i]>'a' && t[i]<='z')
                t[i] = (char)(t[i] - 'a' + 'A' - 1);
            else if(t[i] == 'a')
                t[i] = 'Z';
            else if(t[i]>'A' && t[i]<='Z')
                t[i] = (char)(t[i] - 'A' + 'a' - 1);
            else if(t[i] == 'A')
                t[i] = 'z';
            else if(t[i]>'0' && t[i]<='9')
                t[i] = (char)(t[i]-1);
            else if(t[i] == '0')
                t[i] = '9';
        }
        return String.valueOf(t);
    }

  private static String encode(String code) {
      char[] t = code.toCharArray(); //将String对象转换为字符数组
    for (int i = 0; i < t.length; i++) {
      //
        if (t[i] >= 'a' && t[i] < 'z') {
            t[i] = (char) (t[i] - 'a' + 'A' + 1);
        }else if (t[i] == 'z') {
            t[i] = 'A';
        }else if (t[i] >= 'A' && t[i] < 'Z') {
            t[i] = (char) (t[i] - 'A' + 'a' + 1);
        }else if (t[i] >= '0' && t[i] < '9'){
            t[i] = (char)(t[i] + 1);
        }else if (t[i] == '9'){
            t[i] = '0';
        }
    }
      return String.valueOf(t);
  }
}
