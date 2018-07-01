package com.testng.withAllure;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class bookingTest {

    @Epic("Build UI Testing infrustructure for pms")
    @Story("Verify That User can login to pms using positive credentials")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 3)
    public void positiveBookingTestCase(){
        utilsLibrary.addTextToReport("Positive Booking Test Case");
    }

    @Epic("Build UI Testing infrustructure for pms")
    @Story("Verify That User can't login to pms using negative credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void negativeBookingTestCase(){
        utilsLibrary.addTextToReport("Negative Booking Test Case");
    }
}
