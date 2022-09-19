package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 购物单
 * @author: xiao gou
 * @create: 2022-06-01 21:45
 */
public class GouWuDan {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextLine()) {
          int money = scanner.nextInt();
          int m = scanner.nextInt();
          scanner.nextLine();

          money /= 10;
          int[][] prices = new int[m+1][3];
          int[][] weights = new int[m+1][3];
      for (int i = 1; i <= m; i++) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          int c = scanner.nextInt();
          a /= 10;
          b = b * a;
          if (c == 0) {
              //
              // 主见
              prices[i][0] = a;
              weights[i][0] = b;


          }
        //
      }
      }
  }
}
