package com.pjb.xiaoxiao.leetcode;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 两数之和
 * @author: xiao gou
 * @create: 2022-06-18 09:42
 */
public class 两数之和 {
  public static int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      //
      for (int j = i + 1; j < n; j++) {
        //
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {0};
  }
}
