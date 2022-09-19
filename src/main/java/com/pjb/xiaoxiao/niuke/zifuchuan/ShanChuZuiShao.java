package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 删除最小出现的字符串
 * @author: xiao gou
 * @create: 2022-06-03 10:11
 */
public class ShanChuZuiShao {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String string = scanner.nextLine();
          char[] chars = string.toCharArray();
          // 统计每个字母的数量
          HashMap<Character,Integer> map = new HashMap<>();
          for (char ch: chars) {
              map.put(ch,(map.getOrDefault(ch,0)+1));
          }
          // 找到数量最少的字符数量
          Collection<Integer> values = map.values();
          Integer min = Collections.min(values);

          // 用空字符替换该字母
          for (Character character:map.keySet()) {
              if (map.get(character) == min) {
                  string = string.replace(String.valueOf(character),"");
              }
          }
      System.out.println(string);
      }

  }
}
