package com.pjb.xiaoxiao.niuke.yunsuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 跳7
 * @author: xiao gou
 * @create: 2022-06-07 20:54
 */
public class Tiao7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      //
      if (String.valueOf(i).contains("7") || i % 7 == 0) {
          count++;
      }
    }
    System.out.println(count);
  }
}
