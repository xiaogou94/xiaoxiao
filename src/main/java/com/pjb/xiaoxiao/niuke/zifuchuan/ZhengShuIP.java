package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 整数和ip之间互换
 * @author: xiao gou
 * @create: 2022-06-03 19:47
 */
public class ZhengShuIP {

    private static int N = 4;

  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String str = scanner.next();
          String res = convert(str);
      System.out.println(res);
      }

  }

    private static String convert(String str) {
      if (str.contains(".")) {
          String[] field = str.split("\\.");
          long result = 0;
      for (int i = 0; i < N; i++) {
        //
          result = result * 256 + Integer.parseInt(field[i]);
      }
      return "" + result;
      }
      else {
          long ipv4 = Long.parseLong(str);
          String result = "";
      for (int i = 0; i < N; i++) {
        //
          result = ipv4 % 256 + "." + result;
          ipv4 /= 256;
      }
          return result.substring(0,result.length() - 1);
      }
    }
}
