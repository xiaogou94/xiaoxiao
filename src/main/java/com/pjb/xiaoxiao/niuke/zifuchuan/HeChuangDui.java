package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 合唱队
 * @author: xiao gou
 * @create: 2022-06-03 10:51
 */
public class HeChuangDui {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        //
        arr[i] = scanner.nextInt();
      }

      int[] arr1 = new int[n]; // 存储每个数左边小于其的数的个数
      int[] arr2 = new int[n]; // 存储每个数右边小于数的个数
      arr1[0] = 1; // 最左边的数字设为1
      arr2[n - 1] = 1; // 最右边的数设为1

      for (int i = 0; i < n; i++) {
        //
        arr1[i] = 1;
        for (int j = 0; j < i; j++) {
          //
          if (arr[i] > arr[j]) {
            arr1[i] = Math.max(arr1[j] + 1, arr1[i]);
          }
        }
      }

      for (int i = n - 1; i>= 0 ; i--) {
          arr2[i] = 1;
        for (int j = n - 1; j > 1 ;j--) {
            if (arr[i] > arr[j]) {
                arr2[i] = Math.max(arr2[i],arr2[j] + 1);
            }
          //
        }
      }

      int[] res = new int[n];
      for (int i = 0; i < n; i++) {
          res[i] = arr1[i] + arr2[i] - 1; // 两个都包含本身
      }

      int max = 1;
      for (int i = 0; i < n; i++) {
          if (res[i] > max) {
              max = res[i];
          }
      }
      System.out.println(n -max);
    }
  }
}
