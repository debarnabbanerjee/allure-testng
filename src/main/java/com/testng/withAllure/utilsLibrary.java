package com.testng.withAllure;
import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class utilsLibrary {

    @Attachment(value = "[0]", type = "text/plain")
    public static String addTextToReport(String body){
        return body;
    }

    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseBodyToReport(Response  resp){
        return "Response Body \n" + resp.body().asString();
    }

    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseHeaderToReport(Response  resp){
        return "Response Headers \n" + resp.headers().toString();
    }

    @Attachment(value = "[0]", type = "text/plain")
    public static String addApiResponseCodeToReport(Response  resp){
        return "Response Code " + String.valueOf(resp.statusCode());
    }



}
