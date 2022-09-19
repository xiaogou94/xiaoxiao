package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 二进制
 * @author: xiao gou
 * @create: 2022-06-11 09:27
 */
public class ErjinZhi {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
      int a = scanner.nextInt();
      String b = Integer.toBinaryString(a);
      String c = b.replaceAll("1", "");
      System.out.println(b.length() - c.length());
    }
  }
}
