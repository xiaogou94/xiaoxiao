package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 输入N个数，找出最小的k升序
 * @author: xiao gou
 * @create: 2022-06-10 21:39
 */
public class ShuChuZuiXiao {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          int num = scanner.nextInt();
          int n = scanner.nextInt();
          int[] arr = new int[num];
      for (int i = 0; i < num; i++) {
        //
          arr[i] = scanner.nextInt();
      }
      Arrays.sort(arr);
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      }
  }
}
