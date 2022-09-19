package com.pjb.xiaoxiao.csdn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @program: xiaoxiao
 * @description: 滑动窗口最大值
 * @author: xiao gou
 * @create: 2022-06-20 20:32
 */
public class 滑动窗口最大值 {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
      List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
      int m = Integer.parseInt(scanner.nextLine());
      int maxSum = 0;
    for (int i = 0; i < m; i++) {
      //
        maxSum += nums.get(i);
    }

    int curSum = maxSum;
    for (int i = m; i < n; i++) {
        int diff = nums.get(i) - nums.get(i - m);
        curSum += diff;
        if (curSum > maxSum) {
            maxSum = curSum;
        }
    }
    System.out.println(maxSum);
  }
}
