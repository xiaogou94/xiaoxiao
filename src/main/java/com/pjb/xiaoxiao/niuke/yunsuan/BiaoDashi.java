package com.pjb.xiaoxiao.niuke.yunsuan;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: xiaoxiao
 * @description: 表达式
 * @author: xiao gou
 * @create: 2022-06-07 20:43
 */
public class BiaoDashi {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();

      s = s.replace("{","(");
      s = s.replace("[","(");
      s = s.replace("}",")");
      s = s.replace("]",")");
    System.out.println(slove(s));
  }

    private static int slove(String s) {
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        char[] chs = s.toCharArray();
        int index = 0;
        // 初始化符号为"+"
        char sign = '+';
        // 记录数字
        int number = 0;
    for (int i = 0; i < n; i++) {
      //
        char ch = chs[i];
    }
      return 0;
    }
}
