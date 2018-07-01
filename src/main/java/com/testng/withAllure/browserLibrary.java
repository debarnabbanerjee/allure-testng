package com.testng.withAllure;

import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class browserLibrary {

    static WebDriver driver;

    public static void main(String[] args) {
        browserLibrary bs = new browserLibrary();
        bs.openChromeBrowser();
    }


    public static byte[] convertFromFileToByte(String filePath){
        try{
            File file = new File(filePath);
            //init array with file length
            byte[] bytesArray = new byte[(int) file.length()];

            FileInputStream fis = new FileInputStream(file);
            fis.read(bytesArray); //read file into bytes[]
            fis.close();

            return bytesArray;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] saveScreenshot(){
        return convertFromFileToByte(System.getProperty("user.dir") +"//FullPageScreenshot.png");
    }

    public static void openChromeBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("window-size","1552* 840");
        chromeOptions.addArguments("--window-size=1552x840");

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//newchrome//chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        driver = chromeDriver;
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.navigate().to("http://bbc.com");

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"//FullPageScreenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        driver.quit();
    }
}
