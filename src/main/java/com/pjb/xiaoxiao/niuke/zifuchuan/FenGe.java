package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 字符串分割
 * @author: xiao gou
 * @create: 2022-05-30 22:30
 */
public class FenGe {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String string = scanner.nextLine();
          while (string.length() > 8) {
        System.out.println(string.substring(0,8));
        string = string.substring(8);
          }
          int tmp = 8 - string.length();
      for (int i = 0; i < tmp; i++) {
          string+="0";
      }
      System.out.println(string);
      }
  }
}
