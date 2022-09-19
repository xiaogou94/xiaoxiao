package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: DNA
 * @author: xiao gou
 * @create: 2022-06-06 20:51
 */
public class DNA {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNext()) {
          String str = scanner.nextLine();
          int n = scanner.nextInt();
          char[] ch = str.toCharArray();
          int start = 0,count = 0,max = 0;
      for (int i = 0; i < n; i++) { // 最开始的窗口
        //
          if (ch[i] == 'C' || ch[i] == 'G') {
              count++;
          }
      }
      max = count; //最开始窗口GC数量
          int left = 1,right = n;//从录入窗口的左右点右移一位开始
          while (right < ch.length) {
              if (ch[left -1] == 'C' || ch[left - 1] == 'G') {
                  count--;
              }
              if (ch[right] == 'C' || ch[right] == 'G') { // 右边进来的是CG
                  count++;
              }
              if (count > max) {
                  max = count;
                  start = left;
              }
              left++;
              right++;
          }
          System.out.println(str.substring(start, start + n));
          }
      }
  }
