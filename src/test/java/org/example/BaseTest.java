package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage
{   //creating object for class
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser()
    {   //calling object to open browser
        browserSelector.openSelectedBrowser();
    }
    @AfterMethod
    public void closeBrowser()
    {   //close browser
        driver.quit();
    }
}
