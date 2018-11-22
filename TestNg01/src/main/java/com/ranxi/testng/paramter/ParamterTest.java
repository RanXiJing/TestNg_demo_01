package com.ranxi.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数测试
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age){
        System.out.println("name = "+name+"; age = "+age);
    }
}
