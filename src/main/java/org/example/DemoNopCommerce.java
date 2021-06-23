package org.example;

import org.testng.Assert;

public class DemoNopCommerce extends BasePage
{
    public void verifyHomePage()
    {   //expected url
        String expectedURL = "https://demo.nopcommerce.com/";
        //getting current url
        String actualURL = driver.getCurrentUrl();
        //verifying actual url with expected url
        Assert.assertEquals(actualURL,expectedURL,"URL is not matching");
        //printing message
        System.out.println("URL is matching");
    }
}
