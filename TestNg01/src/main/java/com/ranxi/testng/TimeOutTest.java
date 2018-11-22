package com.ranxi.testng;

import org.testng.annotations.Test;

/**
 * 超时测试
 */
public class TimeOutTest {

    //单位为毫秒值
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
