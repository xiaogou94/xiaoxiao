package com.pjb.xiaoxiao.date;

import sun.nio.ch.ThreadPool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: xiaoxiao
 * @description: 格式化时间加锁
 * @author: xiao gou
 * @create: 2021-10-28 20:35
 */
public class SimpleDateFormatDemoTest3 {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    private static Lock lock = new ReentrantLock();

    private static ThreadLocal<DateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));


  public static void main(String[] args) {
    // 1.创建线程池
      ExecutorService executorService = Executors.newFixedThreadPool(5);
      ThreadPoolTest threadPoolTest = new ThreadPoolTest();
    for (int i = 0; i < 10;i++) {
      //
        executorService.submit(threadPoolTest);
    }
    executorService.shutdown();
  }


  static class ThreadPoolTest implements Runnable{
      @Override
      public void run() {
          try {
//              lock.lock();
              String dateString = simpleDateFormat.format(new Date());
              Date parseDate = simpleDateFormat.parse(dateString);
              String dateString2 = simpleDateFormat.format(parseDate);
              System.out.println(Thread.currentThread().getName() + "线程是否安全:" + dateString.equals(dateString2));
          } catch (ParseException e) {
        System.out.println(Thread.currentThread().getName()+"格式化失败");
          } finally {
//              lock.unlock();
              // 避免内存泄漏，使用完记得释放
              threadLocal.remove();
          }
      }
  }
}
