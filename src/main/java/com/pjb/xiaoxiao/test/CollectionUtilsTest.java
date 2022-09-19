package com.pjb.xiaoxiao.test;

import com.pjb.xiaoxiao.utils.CollectionUtils;
import com.pjb.xiaoxiao.vo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: xiaoxiao
 * @description: CollectionUtils测试类
 * @author: xiao gou
 * @create: 2022-01-26 22:15
 */
public class CollectionUtilsTest {

  public static void main(String[] args) throws InterruptedException {

      // 一百条为基准让一个线程去处理
      List<Person> personList = new ArrayList<>();
      List<List<Person>> groupList = CollectionUtils.partition(personList, 100);
      CountDownLatch countDownLatch = new CountDownLatch(groupList.size());
      ExecutorService executorService = Executors.newFixedThreadPool(groupList.size());

    // 根据分组长度循环处理
    for (int i = 0; i < groupList.size(); i++) {
      //
        int finalI = i;
      executorService.execute(
          () -> {
            List<Person> personListGroup = groupList.get(finalI);
            for (Person person : personListGroup) {
              // 这里处理业务
              System.out.println(person);
            }
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    executorService.shutdown();//关闭线程池
  }
}
