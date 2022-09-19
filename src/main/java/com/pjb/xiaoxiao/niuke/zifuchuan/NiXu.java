package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 整个字符逆序
 * @author: xiao gou
 * @create: 2022-06-03 20:38
 */
public class NiXu {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String str = scanner.nextLine();
      String res = reverse(str);
      System.out.println(res);
    }
  }

  private static String reverse(String str) {
    StringBuffer res = new StringBuffer(str);
    return res.reverse().toString();
  }
}
