package com.testng.withAllure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class browserLibrary {

    static WebDriver driver;

    public static void main(String[] args) {
        browserLibrary bs = new browserLibrary();
        bs.openChromeBrowser();
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
