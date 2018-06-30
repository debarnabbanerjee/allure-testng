package com.testng.withAllure;

import org.testng.annotations.Test;

public class loginTest {

    @Test(priority = 1)
    public void positiveLoginTestCase(){
        System.out.println("From Postive Login Testing...");
    }

    @Test(priority = 2)
    public void negativeLoginTestCase(){
        System.out.println("From negative Login Test Case");
    }


}
