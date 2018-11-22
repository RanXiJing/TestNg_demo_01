package com.ranxi.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {

    @Test
    public void ignorel(){
        System.out.println("ignorel 执行");
    }

    //enabled：控制执不执行该测试
    @Test(enabled = false)
    public void ignorel2(){
        System.out.println("ignorel2 执行");
    }

    @Test(enabled = true)
    public void ignorel3(){
        System.out.println("ignorel3 执行");
    }
}
