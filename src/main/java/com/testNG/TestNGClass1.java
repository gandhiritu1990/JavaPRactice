package com.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass1 {

    @Test (priority = -2)
    public void test1(){
        System.out.println("Inside test 1");
    }

    @Test (priority = -3)
    public void test2(){
        System.out.println("Inside test 2");
        Assert.assertEquals(1,2);
    }

    @Test (groups = {"Smoke"})
    public void test3(){
        System.out.println("Inside test 3");
    }

/*    @Test (dependsOnMethods = {"test5"})
    public void test4(){
        System.out.println("Inside test 4");
    }

    @Test (enabled = true)
    public void test5(){
        System.out.println("Inside test 5");
       Assert.assertEquals(1,2);
    }*/

    @Test (dataProvider = "dp")
    public void test6(String param){
        System.out.println(param);

    }

    @DataProvider (name = "dp")
    public Object[][] test7(){
        return new Object[][]{{"test1"},{"test2"}};
    }
}
