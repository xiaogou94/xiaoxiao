package com.pjb.xiaoxiao.niukenew;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 求最小公倍数
 * @author: xiao gou
 * @create: 2022-06-18 11:17
 */
public class 求最小公倍数 {
  public static void main(String[] args) {
    //

      Scanner scanner = new Scanner(System.in);
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
    System.out.println(n1 * n2 / gongYueShu(n1,n2));
  }

    private static int gongYueShu(int n1, int n2) {
      if (n1 == n2) {
          return n2;
      }
      if (n1 > n2) {
          int differ = n1 - n2;
          return gongYueShu(n2,differ);
      }else {
          int differ = n2 - n1;
          return gongYueShu(n1,differ);
      }
    }
}
