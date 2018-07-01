package com.testng.withAllure;

import org.testng.annotations.Test;

public class loginTest {

    @Test(priority = 1,description="Valid Login Scenario with wrong username and password.")
    public void positiveLoginTestCase(){
        utilsLibrary.addTextToReport("From Positive Login Testing...");
    }

    @Test(priority = 2,description="Invalid Login Scenario with wrong username and password.")
    public void negativeLoginTestCase(){
        utilsLibrary.addTextToReport("From negative Login Test Case");
    }



}
