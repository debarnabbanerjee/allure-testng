package com.testng.withAllure;

import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class getRequestTesting {

    private String url = "https://reqres.in/api/users";

    @Epic("Build UI Testing infrustructure for pms")
    @Story("Verify That User information can be checked from api level.")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5,description = "Test to check that all users list can ge get from api")
    public void getUsersList(){
        utilsLibrary.addTextToReport("Test to check that all users list can ge get from api.");

        Response response = RestAssured.get(url);
      //  System.out.println(response.body().asString());
        utilsLibrary.addApiResponseCodeToReport(response);
        utilsLibrary.addApiResponseHeaderToReport(response);
        utilsLibrary.addApiResponseBodyToReport(response);


    }
}
