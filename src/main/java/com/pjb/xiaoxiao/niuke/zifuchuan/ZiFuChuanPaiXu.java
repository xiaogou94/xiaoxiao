package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 字符串排序
 * @author: xiao gou
 * @create: 2022-06-03 11:35
 */
public class ZiFuChuanPaiXu {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String str = scanner.nextLine();
      String res = sort(str);
      System.out.println(res);
    }
  }

  private static String sort(String str) {
    // 先将英文字母收集起来
    List<Character> letters = new ArrayList<>();
    for (char ch : str.toCharArray()) {
      if (Character.isLetter(ch)) {
        letters.add(ch);
      }
    }
    // 将英文字母先排序好
    letters.sort(Comparator.comparingInt(Character::toLowerCase));

    // 若是非英文字母则直接添加
    StringBuilder result = new StringBuilder();
    for (int i = 0, j = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i))) {
        result.append(letters.get(j++));
      } else {
        result.append(str.charAt(i));
      }
    }
    return result.toString();
  }
}
