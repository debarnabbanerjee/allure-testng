package com.testng.withAllure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class utilsLibrary {

    @Step("Adding execution information to reports:")
    @Attachment(value = "[0]", type = "text/plain")
    public static String addTextToReport(String body){
        return body;
    }

    @Step("Adding response body to reports:")
    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseBodyToReport(Response  resp){
        return "Response Body \n" + resp.body().asString();
    }

    @Step("Adding respone headers to reports:")
    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseHeaderToReport(Response  resp){
        return "Response Headers \n" + resp.headers().toString();
    }

    @Step("Adding respone code to reports:")
    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseCodeToReport(Response  resp){
        return "Response Code " + String.valueOf(resp.statusCode());
    }



}
