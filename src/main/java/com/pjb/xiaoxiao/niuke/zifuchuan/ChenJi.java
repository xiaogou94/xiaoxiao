package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 成绩
 * @author: xiao gou
 * @create: 2022-06-11 12:42
 */
public class ChenJi {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      Map<Integer,String> map = new HashMap<>();
      while (scanner.hasNextLine()) {
          int n = Integer.parseInt(scanner.nextLine());
          int flag = Integer.parseInt(scanner.nextLine()); //1升序 0降序
          int[][] score = new int[n][2];
      for (int i = 0; i < n; i++) {
        //
          String[] nameAndScore = scanner.nextLine().split("\\s+");
          score[i][0] = i;
          score[i][1] = Integer.parseInt(nameAndScore[1]);
          map.put(i,nameAndScore[0]);
      }

      Arrays.sort(score,(o1, o2) -> {
         if (flag == 0) {
             return o2[1] - o1[1]; // 按第二列降序升序，如果相等的话，返回0，顺序不变
         }else {
             return o1[1] - o2[1]; //按第二列升序
         }
      });
      for (int i = 0; i < n; i++) {
        System.out.println(map.get(score[i][0] + "" + score[i][1]));
      }
      }
  }
}
