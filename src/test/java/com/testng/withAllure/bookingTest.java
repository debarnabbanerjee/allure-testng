package com.testng.withAllure;

import org.testng.annotations.Test;

public class bookingTest {

    @Test(priority = 3)
    public void positiveBookingTestCase(){
        apiLibrary.addTextToReport("Positive Booking Test Case");
    }

    @Test(priority = 4)
    public void negativeBookingTestCase(){
        apiLibrary.addTextToReport("Negative Booking Test Case");
    }
}
