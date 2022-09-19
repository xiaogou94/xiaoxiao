package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 截取字符串
 * @author: xiao gou
 * @create: 2022-06-06 21:33
 */
public class JieQuZiFuChuan {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String string = scanner.nextLine();
          int N = scanner.nextInt();
      System.out.println(string.substring(0,N));
      }
  }
}
