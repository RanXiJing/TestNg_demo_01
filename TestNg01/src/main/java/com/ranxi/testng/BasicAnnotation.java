package com.ranxi.testng;

import org.testng.annotations.*;

/**
 * 了解注解
 */
public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void test1(){
        System.out.println("这是测试用例1");
        System.out.printf("Thread Id : %s%n",Thread.currentThread());
    }

    @Test
    public void test2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("BeforClass这是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件，这是在类运行之前运行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件，这是在类运行之后运行的");
    }
}
