package testautomation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver driver;
    //public WebDriver chrome;
    public Driver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //chrome = new ChromeDriver();
        //chrome.manage().window().maximize();
        //driver.close();

    }

}




