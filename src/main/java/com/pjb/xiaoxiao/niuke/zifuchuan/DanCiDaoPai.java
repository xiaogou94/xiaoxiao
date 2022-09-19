package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 单词倒排
 * @author: xiao gou
 * @create: 2022-06-03 18:07
 */
public class DanCiDaoPai {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String str = scanner.nextLine();
      String res = reverse(str);
      System.out.println(res);
    }
  }

    private static String reverse(String str) {
      // 匹配非字母的字符进行分割
        String[] words = str.split("[^A-Za-z]");
        StringBuilder stringBuilder = new StringBuilder();
    for (int i = words.length -1; i >= 0; i--) {
      //
        stringBuilder.append(words[i]).append(" ");
    }
      return stringBuilder.toString().trim();
    }
}
