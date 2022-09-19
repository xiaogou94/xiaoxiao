package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 字符串加密
 * @author: xiao gou
 * @create: 2022-06-04 11:44
 */
public class ZiFuChuanJiami {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String s1 = scanner.nextLine().toUpperCase();
          String s2 = scanner.nextLine();
          char[] char1 = s1.toCharArray();
          char[] char2 = s2.toCharArray();
          LinkedHashSet<Character> set = new LinkedHashSet<>();
      for (int i = 0; i < char1.length; i++) {
        //
          set.add(char1[i]);
      }
      int k = 0;
      while (set.size() < 26) {
          char a = (char)('A' + k);
          set.add(a);
          k++;
      }
      ArrayList<Character> list = new ArrayList<>(set);
      StringBuffer stringBuffer = new StringBuffer();
      for (int i = 0; i < char2.length; i++) {
        //
          if (char2[i] == ' '){
              stringBuffer.append(char2[i]);
          }else if (char2[i] < 'a') {
              int n = char2[i] - 'A';
              char c = list.get(n);
              stringBuffer.append(c);
          }else {
              int n = (int)(char2[i] - 'a');
              char c = (char)(list.get(n) + 'a' - 'A');
              stringBuffer.append(c);
          }
      }
      System.out.println(stringBuffer.toString());
      }
  }
}
