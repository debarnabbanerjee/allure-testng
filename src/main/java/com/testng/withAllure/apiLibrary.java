package com.testng.withAllure;
import io.qameta.allure.Attachment;
public class apiLibrary {

    @Attachment(value = "[0]", type = "text/plain")
    public static String addTextToReport(String body){
        return body;
    }

}
