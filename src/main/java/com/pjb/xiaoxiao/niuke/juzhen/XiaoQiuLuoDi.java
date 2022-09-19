package com.pjb.xiaoxiao.niuke.juzhen;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 小球落地
 * @author: xiao gou
 * @create: 2022-06-04 14:50
 */
public class XiaoQiuLuoDi {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          int n = scanner.nextInt();
          double sum = 0;
          double temp = n;
      for (int i = 0; i < 5; i++) {
        //
          sum+=temp*2;
          temp=temp/2;
      }
      //
          sum -= n;
          System.out.printf("%.6f\n",sum);
          System.out.printf("%.6f\n",temp);
//          System.out.printf("sum",sum);
//          System.out.printf("temp",temp);
// 1 + 0.5 * 2 + 0.25 * 2 + 0.125 * 2 + 0.0625 * 2
      }
  }
}
