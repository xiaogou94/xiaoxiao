package com.pjb.xiaoxiao.niuke.yunsuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 完全数
 * @author: xiao gou
 * @create: 2022-06-07 21:45
 */
public class wanQuanShu {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          int a = scanner.nextInt();
          int count = 0;
      for (int i = 2; i <= a; i++) {
        //
          if (aaa(i)) {
              count++;
          }
      }
      System.out.println(count);
      }
  }

    private static boolean aaa(int num) {
      int sum = 0;
    for (int i = 2; i < num; i++) {
      //
        if (num % i == 0) {
            sum+=i;
        }
    }
    if (sum + 1 == sum) {
        return true;
    }
    return false;
    }
}
