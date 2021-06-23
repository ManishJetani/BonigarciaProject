package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage
{   //object creating of LoadProperty class
    LoadProperty loadProperty = new LoadProperty();

    public void openSelectedBrowser()
    {   //storing variable
        String browserName = loadProperty.getProperty("browserName");
        //applying conditional statement
        switch (browserName)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Browser is not recognised.Please enter the correct browser name");
        }
        //maximise windows
        driver.manage().window().maximize();
        //applying timeouts
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //opening web page
        driver.get("https://demo.nopcommerce.com/");
    }
}
