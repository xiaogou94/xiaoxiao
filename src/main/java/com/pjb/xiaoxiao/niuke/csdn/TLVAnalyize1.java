package com.pjb.xiaoxiao.niuke.csdn;

import java.util.Scanner;

/**
 * @program: xiaoxiao
 * @description: TLV
 * @author: xiao gou
 * @create: 2022-06-04 20:52
 */
public class TLVAnalyize1 {
  public static void main(String[] args) {
    //
      Scanner in = new Scanner(System.in);
      String tag = in.nextLine();
      String[] tlv = in.nextLine().split(" ");
    for (int i = 0; i < tlv.length; i++) {
      //
        int length = Integer.parseInt(tlv[i+2] + tlv[i+1],16);//将字符串length转为16进制，小端，需要反过来
        if (tag.equals(tlv[i])) {
            StringBuffer stringBuffer = new StringBuffer();
        for (int j = i+3; j < i+3+length; j++) {
          //
            stringBuffer.append(tlv[j]).append(" ");
          System.out.println(stringBuffer.toString());
          break;
        }
        }else {
            i+= length + 3;
        }
    }
  }
}
