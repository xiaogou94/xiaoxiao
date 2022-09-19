package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 质数因子
 * @author: xiao gou
 * @create: 2022-05-31 20:18
 */
public class ZhiShu {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
         int num = scanner.nextInt();
      for (int i = 2; i <= num;i++) {
        while (num % i == 0) {
          System.out.print(i);
          num = num / i;
          System.out.print(" ");
        }
      }
      }
  }
}
