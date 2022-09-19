package com.pjb.xiaoxiao.quartz;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import javax.print.attribute.standard.JobHoldUntil;

/**
 * @program: xiaoxiao
 * @description: 定时器
 * @author: xiao gou
 * @create: 2021-10-24 09:20
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("需要去数据库扫描了");
    }

  public static void main(String[] args) throws SchedulerException {
    // 创建任务
      JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1","group1").build();
      // 创建触发器 每3s 执行一次
      Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger","group3").withSchedule(
              SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3).repeatForever()
      ).build();

      Scheduler scheduler = new StdSchedulerFactory().getScheduler();
      // 将任务及触发器放入调度器
      scheduler.scheduleJob(jobDetail,trigger);
      // 调度器开始调度任务
      scheduler.start();
  }
}
