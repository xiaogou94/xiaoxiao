package com.pjb.xiaoxiao.url;

/**
 * @program: xiaoxiao
 * @description: 短连接生成
 * @author: xiao gou
 * @create: 2021-12-19 18:27
 */
public class ShortUrl {

    private static final String BASE = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String toBase62(long num){
        StringBuffer stringBuffer = new StringBuffer();
        do {
            int i = (int) (num % 62);
            stringBuffer.append(BASE.charAt(i));
            num = num / 62;
        } while (num>0);
        return stringBuffer.reverse().toString();
    }

    public static long toBase10(String str){
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
      //
      System.out.println(str.charAt(i));
            result  = result * 62 + BASE.indexOf(str.charAt(i));
        }
        return  result;
    }

  public static void main(String[] args) {
    //
      System.out.println(toBase10("tzHLFw"));
      System.out.println(toBase62(27095455234L));
  }
}
