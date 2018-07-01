package com.testng.withAllure;

import org.testng.annotations.Test;

public class bookingTest {

    @Test(priority = 3)
    public void positiveBookingTestCase(){
        utilsLibrary.addTextToReport("Positive Booking Test Case");
    }

    @Test(priority = 4)
    public void negativeBookingTestCase(){
        utilsLibrary.addTextToReport("Negative Booking Test Case");
    }
}
