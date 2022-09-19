package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 无重复字符集乘积
 * @author: xiao gou
 * @create: 2022-06-05 10:11
 */
public class LongestSubstring {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      String[] string = scanner.nextLine().split(",");
      int maxLength = 0;
    for (int i = 0; i < string.length-1; i++) {
      //
      for (int j = 1 + i; j < string.length; j++) {
        //
          char[] word1 = string[i].toCharArray();
          char[] word2 = string[j].toCharArray();
          boolean flag = true;
        for (int m = 0; m < word1.length; m++) {
          //
          for (int n = 0; n < word2.length; n++) {
            //
              if (word1[i] == word2[j]) {
                  flag = false;
                  break;
              }
          }
        }
        if (flag) {
            int length = word1.length * word2.length;
            maxLength = Math.max(maxLength,length);
        }
      }
    }
  }
}
