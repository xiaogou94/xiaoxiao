package com.pjb.xiaoxiao.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: xiaoxiao
 * @description: 倒计时器示例:火箭发射
 * @author: xiao gou
 * @create: 2022-01-26 22:35
 */
public class CountDownLatchDemo implements Runnable{

    static final CountDownLatch latch = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @Override
    public void run() {
      // 模拟检查任务
        try {
            Thread.sleep(1000);
      System.out.println("check complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            // 计数器减一
            //放在finally避免任务执行过程出现异常，导致countDown()不能被执行
            latch.countDown();
        }
    }

  public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {
    //
//      ExecutorService executorService = Executors.newFixedThreadPool(10);
//    for (int i = 0; i < 10; i++) {
//        executorService.execute(demo);
//    }
//    // 等待检查
//      latch.await();
//
//    // 发射火箭
//    System.out.println("Fire");
//    // 关闭线程池
//      executorService.shutdown();

      // 证明String不可变
//      String hello = "hello";
//      hello = hello.replace("h","q");
//    System.out.println(hello);

//      Map<String,String> map = new HashMap<>();
//      String s = "Hello World";
//      String s1 = "Hello_World";
//      map.put(s,"111");
//      map.put(s1,"222");
//
//    System.out.println(map.toString());
//
//      Field valueFieldOfString = String.class.getDeclaredField("value");
//      valueFieldOfString.setAccessible(true);
//    char[] value = (char[]) valueFieldOfString.get(s);
//        value[5] = '_';
//    System.out.println(map.toString());
      String str = "abcdaaarrd";
      Set<Character> set = containRepeatChar(str);
    System.out.println(set);
  }


    /**
     * 判断字符串有没有重复的字符
     * @param str
     * @return
     */
    public static Set<Character> containRepeatChar(String str) {
      Set<Character> set = new HashSet<>();
      char[] element = str.toCharArray();
      for (char e : element) {
          if (str.indexOf(e) != str.lastIndexOf(e)) {
           set.add(e);
          }
      }
      return set;
    }

}
