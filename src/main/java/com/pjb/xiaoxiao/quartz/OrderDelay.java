package com.pjb.xiaoxiao.quartz;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @program: xiaoxiao
 * @description: 利用jdk自带的DelayQueue
 * @author: xiao gou
 * @create: 2021-10-24 09:48
 */
public class OrderDelay implements Delayed {

    private String orderId;

    private long timeout;

    public OrderDelay(String orderId, long timeout) {
        this.orderId = orderId;
        this.timeout = timeout;
    }

    /**
     * 返回距离你自定义的超时时间还有多少
     * @param unit
     * @return
     */
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(timeout - System.nanoTime(),TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        if (other == this) {
            return 0;
        }
        OrderDelay t = (OrderDelay) other;
        long d = (getDelay(TimeUnit.NANOSECONDS) - t.getDelay(TimeUnit.NANOSECONDS));
        return (d == 0)?0:((d<0)?-1:1);
    }
}
