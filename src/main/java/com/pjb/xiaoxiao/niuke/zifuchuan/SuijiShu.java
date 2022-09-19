package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: xiaoxiao
 * @description: 明明随机数
 * @author: xiao gou
 * @create: 2022-05-30 21:54
 */
public class SuijiShu {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      Set<String> set = new TreeSet<>();
    for (int i = 0; i < N+1; i++) {
      //
        set.add(scanner.nextLine());
        if (i == 0){
            set.remove("");
        }
    }
     for (String str : set) {
      System.out.println(str);
     }
  }
}
