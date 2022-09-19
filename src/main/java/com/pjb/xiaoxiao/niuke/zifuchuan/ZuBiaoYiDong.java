package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: xiaoxiao
 * @description: 坐标移动
 * @author: xiao gou
 * @create: 2022-06-01 22:27
 */
public class ZuBiaoYiDong {
  public static void main(String[] args) throws IOException {
    //
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String[] in = bf.readLine().split(";");
      int x = 0;
      int y = 0;
      for (String s : in) {
          if (!s.matches("[WSAD][0-9]{1,2}")){
              continue;
          }
          int val = Integer.valueOf(s.substring(1));
          switch (s.charAt(0)) {
              case 'W':
                  y += val;
                  break;
              case 'S':
                  y -= val;
                  break;
              case 'A':
                  x -= val;
                  break;
              case 'D':
                  x += val;
                  break;
          }
      }
    System.out.println(x + "," + y);
  }
}
