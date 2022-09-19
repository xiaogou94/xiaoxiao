package com.pjb.xiaoxiao.executor;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: xiaoxiao
 * @description: 异步线程池
 * @author: xiao gou
 * @create: 2021-11-13 21:20
 */
public class Test {
  public static void main(String[] args) {
    //
      ExecutorService executorService = Executors.newSingleThreadExecutor();
      CompletableFuture<Void> rFuture = CompletableFuture
              .runAsync(() -> System.out.println("hello void"), executorService);

      CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
          System.out.println("hello ");return "siting";
      },executorService);

    System.out.println(rFuture.join());
    // 阻塞等待
      String name = future.join();
      System.out.println(name);
      executorService.shutdown();
  }
}
