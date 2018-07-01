package com.testng.withAllure;

import io.qameta.allure.Attachment;
import org.testng.annotations.Test;

public class loginTest {

    @Test(priority = 1,description="Valid Login Scenario with wrong username and password.")
    public void positiveLoginTestCase(){
        apiLibrary.addTextToReport("From Positive Login Testing...");
    }

    @Test(priority = 2,description="Invalid Login Scenario with wrong username and password.")
    public void negativeLoginTestCase(){
        apiLibrary.addTextToReport("From negative Login Test Case");
    }


    
}
