package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @program: xiaoxiao
 * @description: 非空字符串
 * @author: xiao gou
 * @create: 2022-06-10 21:51
 */
public class FeiKongZiFu {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextLine()) {
          String str = scanner.nextLine();
          int result = count(str);
          if (result == -1) {
        System.out.println(result);
          }else {
        System.out.println((char) result);
          }
      }
  }

    private static int count(String str) {
      Map<Character,Integer> map = new HashMap<>();
      for (char ch :str.toCharArray()) {
          map.put(ch,map.getOrDefault(ch,0)+ 1);
      }
      for (char ch:str.toCharArray()) {
          if (map.get(ch) == 1) {
              return ch;
          }
      }
      return -1;
    }
}
