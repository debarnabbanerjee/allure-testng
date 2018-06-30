package com.testng.withAllure;

import org.testng.annotations.Test;

public class bookingTest {

    @Test(priority = 3)
    public void positiveBookingTestCase(){
        System.out.println("Positive Booking Test Case");
    }

    @Test(priority = 4)
    public void negativeBookingTestCase(){
        System.out.println("Negative Booking Test Case");
    }
}
