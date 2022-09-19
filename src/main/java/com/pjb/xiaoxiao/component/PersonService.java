package com.pjb.xiaoxiao.component;

import com.pjb.xiaoxiao.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
*@program: xiaoxiao
*@description: PersonService类
*@author: xiao gou
*@create: 2021-12-12 11:44
*/
public class PersonService {

    private static final int THREAD_COUNT = 10;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private ThreadPoolExecutor executor;

    private AtomicInteger integer = new AtomicInteger();

    private Random random = new Random();

    private String[] names = {"黄某人", "负债程序猿", "谭sir", "郭德纲", "蔡徐鸡", "蔡徐母鸡", "李狗蛋", "铁蛋", "赵铁柱"};
    private String[] addrs = {"二仙桥", "成华大道", "春熙路", "锦里", "宽窄巷子", "双子塔", "天府大道", "软件园", "熊猫大道", "交子大道"};
    private String[] companys = {"京东", "腾讯", "百度", "小米", "米哈游", "网易", "字节跳动", "美团", "蚂蚁", "完美世界"};

    @Scheduled(cron = "0/15 * * * * ?")
    public void insertList(){

        System.out.println("本轮任务开始，总任务数：" + THREAD_COUNT);
        long start = System.currentTimeMillis();
        AtomicLong end = new AtomicLong();
    for (int i = 0; i < THREAD_COUNT; i++) {
      //
        Thread thread = new Thread(()->{
            for (int j=0;j<20;j++){
                // 数据库插入
            }
            end.set(System.currentTimeMillis());
            System.out.println("本轮任务耗时：" + (end.get() - start) + "____已执行" + integer.addAndGet(1) + "个任务" + "____当前队列任务数" + executor.getQueue().size());
        });
        executor.execute(thread);
    }
    }

}
