package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 非严格递增连续数字序列
 * @author: xiao gou
 * @create: 2022-06-05 10:28
 */
public class increaseNumSubsequences {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    int maxLength = 0;
    int length = 0;
    char maxChar = '0';//存储上一个数字字符
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c >= maxChar && c <= '9') {  // 判断是否是非递减
        length++;
        maxChar = c;
        maxLength = Math.max(length, maxLength);
      } else if (c >= '0' && c <= '9') {  // 是数字，但小于上一个数字
        length = 1;
        maxChar = c;
      } else {  // 如果不是数字
        length = 0;
        maxChar = '0';
      }
    }
    System.out.println(maxLength);
  }
}
