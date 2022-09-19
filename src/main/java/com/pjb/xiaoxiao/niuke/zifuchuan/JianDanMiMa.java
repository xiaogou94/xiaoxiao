package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 简单密码
 * @author: xiao gou
 * @create: 2022-06-02 21:17
 */
public class JianDanMiMa {
  public static void main(String[] args) {
    //
      HashMap<String,Integer> map = new HashMap<>();
    map.put("abc",2);
    map.put("def",3);
    map.put("ghi",4);
    map.put("jkl",5);
    map.put("mno",6);
    map.put("pqrs",7);
    map.put("tuv",8);
    map.put("wxyz",9);
    Scanner scanner = new Scanner(System.in);
    String line = scanner.next();
    for (char c: line.toCharArray()) {
      if (c>= 'A' && c<= 'Z') {
        if (c+32 == 'z') {
          System.out.println('a');
        }
        else {
          System.out.println((char)c+33);
        }
      }else if (c >= 'a' && c<= 'z') {
        final Character cF = c;
        String key = map.keySet().stream().filter(o-> o.contains(cF.toString())).findAny().get();
        System.out.println(map.get(key));
      }else {
        System.out.println(c);
      }
    }
  }
}
