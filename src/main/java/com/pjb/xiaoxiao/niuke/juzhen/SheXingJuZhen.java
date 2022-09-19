package com.pjb.xiaoxiao.niuke.juzhen;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 蛇形矩阵 输入： 4 复制 输出：
 * 1 3 6 10 2 5 9 4 8 7
 * @author: xiao gou
 * @create: 2022-06-04 09:38
 */
public class SheXingJuZhen {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          int num = scanner.nextInt();
          printtriangle(num);
      }
  }

    private static void printtriangle(int num) {
      int y = 1; //列的方向第一个肯定是1
      int yCount = 1; //列由上往下是等差数列，第一行和第二行差1
    for (int i = 0; i < num; i++) { //行的循环次数
      //
        int x = y;// 第i行的第一个数就是列的第i的数
        int xCount = i + 1; // 可以看到第i行第一个加数刚好是i+1
      for (int j = 0; j < num - i + 1; j++) {
        //
        System.out.println(x + ""); // 循环输出x
          x+=xCount++;
      }
      System.out.println(" ");//换行
        y+=yCount++;
    }
    }
}
