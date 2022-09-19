package com.pjb.xiaoxiao.niuke.zifuchuan;


import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 汽水瓶
 * @author: xiao gou
 * @create: 2022-06-03 09:38
 */
public class QiShuiPing {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (!scanner.hasNext("0")) {
          int n = scanner.nextInt();
          int count = 0;
          while (n/3>0 || n == 2){
              count +=  n/3;
              n = n/3 + n%3;
              if (n == 2) {
                  n++;
              }
          }
      System.out.println(count);
      }
  }
}
