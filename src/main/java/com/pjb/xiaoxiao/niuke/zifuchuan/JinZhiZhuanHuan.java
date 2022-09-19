package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 进制转换
 * @author: xiao gou
 * @create: 2022-05-31 20:05
 */
public class JinZhiZhuanHuan {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String str = scanner.nextLine();
      System.out.println(Integer.parseInt(str.substring(2),16));
      }
  }
}
