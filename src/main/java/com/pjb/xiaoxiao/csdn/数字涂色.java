package com.pjb.xiaoxiao.csdn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 数字涂色
 * @author: xiao gou
 * @create: 2022-06-18 16:14
 */
public class 数字涂色 {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      //
      nums[i] = scanner.nextInt();
    }
    Arrays.sort(nums);

    boolean[] booleans = new boolean[n];
    int res = 0;
    for (int i = 0; i < n; i++) {
      if (booleans[i]) {
        continue;
      } else {
        for (int j = 0; j < n; j++) {
          //
          if (nums[j] % nums[i] == 0) {
            booleans[j] = true;
          }
        }
        res++;
      }
    }
    System.out.println(res);
  }
}
