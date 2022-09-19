package com.pjb.xiaoxiao.niuke.zifuchuan;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: 矩阵最大值
 * @author: xiao gou
 * @create: 2022-06-05 16:36
 */
public class MaxMatrix {
  public static void main(String[] args) {
    //
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      scanner.nextLine();
      int total = 0;
      while (n>0) {
          String[] maxrix = scanner.nextLine().split(",");
          total+= deal(maxrix);
          n--;
      }
    System.out.println(total);
  }

    private static int deal(String[] maxrix) {
      int max = 0;
    for (int i = 0; i < maxrix.length; i++) {
      //
        if ("1".equals(maxrix[i])) {
            StringBuffer stringBuffer = new StringBuffer();
        for (int m = i; m < maxrix.length; m++) { //先加后半部分
          //
            stringBuffer.append(maxrix[m]);
        }

        for (int n = 0; n < i; n++) { // 再加前半部分
            stringBuffer.append(maxrix[n]);
        }
        max = Math.max(max,Integer.parseInt(stringBuffer.toString(),2));
        }
    }
      return max;
    }
}
