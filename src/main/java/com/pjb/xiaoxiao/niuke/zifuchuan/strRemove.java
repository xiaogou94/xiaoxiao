package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: xiaoxiao
 * @description: 字符串消除
 * @author: xiao gou
 * @create: 2022-06-06 21:08
 */
public class strRemove {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    Stack<Character> stack = new Stack<>();
    // 先判断字符串是否有不是大小字母的字符
    for (int i = 0; i < string.length(); i++) {
      //
      char ch = string.charAt(i);
      if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
        System.out.println(0);
        return;
      }
      if (stack.isEmpty() || stack.peek() != ch) {
        stack.push(ch);
      } else {
        stack.pop();
      }
    }
    System.out.println(stack.size());
  }
}
