package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{   //creating object for class
    DemoNopCommerce demoNopCommerce = new DemoNopCommerce();

    @Test
    public void openingHomePage()
    {   //verifying homepage
        demoNopCommerce.verifyHomePage();
    }
}
