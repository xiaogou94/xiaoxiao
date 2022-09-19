package com.pjb.xiaoxiao.niuke.juzhen;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 兔子
 * @author: xiao gou
 * @create: 2022-06-04 14:36
 */
public class TuZi {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          int n = scanner.nextInt();
      System.out.println(getTotalCount(n));
      }
  }

    private static int getTotalCount(int n) {
      if (n<3) {
          return 1;
      }
      return getTotalCount(n-2) + getTotalCount(n-1);
    }
}
