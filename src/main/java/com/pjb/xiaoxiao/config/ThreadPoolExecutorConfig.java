package com.pjb.xiaoxiao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: xiaoxiao
 * @description: 线程池配置
 * @author: xiao gou
 * @create: 2021-12-12 12:30
 */
@Configuration
public class ThreadPoolExecutorConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 12, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }
}
