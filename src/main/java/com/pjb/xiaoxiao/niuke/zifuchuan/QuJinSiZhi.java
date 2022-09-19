package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 取近似值
 * @author: xiao gou
 * @create: 2022-05-31 21:42
 */
public class QuJinSiZhi {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      float f = scanner.nextFloat();
      System.out.println(Math.round(f));
  }
}
