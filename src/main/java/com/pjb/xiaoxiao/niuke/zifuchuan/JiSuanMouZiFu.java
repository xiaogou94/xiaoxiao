package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 计算某字符出现次数 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。
 * @author: xiao gou
 * @create: 2022-05-30 21:20
 */
public class JiSuanMouZiFu {
  //  public static void main(String[] args) {
  //    //
  //      Scanner scanner = new Scanner(System.in);
  //      String str = scanner.nextLine().toLowerCase();
  //      char chars = scanner.nextLine().toLowerCase().charAt(0);
  //      System.out.println(count(chars,str));
  //    }
  //
  //      public static int count(char chars,String string) {
  //      int num = 0;
  //      char[] chars1 = string.toCharArray();
  //      for (char ch : chars1) {
  //          if (ch == chars) {
  //              num++;
  //          }
  //      }
  //      return num;
  //  }
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      String string = scanner.nextLine().toLowerCase();
      String str = scanner.nextLine().toLowerCase();
      System.out.println(string.length() - string.replaceAll(str,"").length());
  }
}
