package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 放苹果
 * @author: xiao gou
 * @create: 2022-06-11 09:05
 */
public class FangPingGuo {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextInt()) {
      System.out.println(count(scanner.nextInt(),scanner.nextInt()));
      }
      scanner.close();
  }

    private static int count(int m, int n) {
      if (m<0 || n<=0) {
          return 0;
      }
      // 细分到苹果数为一或者盘子数为一的情况返回一
        if (m==1 || n==1 || m==0) {
            return 1;
        }
        // 将此事件无线细分
        return count(m,n-1) + count(m-n,n);
    }
}
