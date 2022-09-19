package com.pjb.xiaoxiao.executor;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.util.Assert;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: xiaoxiao
 * @description: 异步线程
 * @author: xiao gou
 * @create: 2021-12-19 17:57
 */
public class Async {
  public static void main(String[] args) {
    //
      ExecutorService executors = Executors.newFixedThreadPool(1);
      executors.execute(new TestThread());
  }

//  public void execute(Runnable task,long startTime){
//      Assert.notNull(task,"Runnable must not be null");
//      Runnable taskToUse = this.
//  }
}
