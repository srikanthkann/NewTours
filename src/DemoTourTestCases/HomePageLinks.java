package DemoTourTestCases;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.RegistrationPage;
import Utility.BrowserUtil;


public class HomePageLinks {


	@Test
    public void TestHomelLink(){
                HomePage home = new HomePage(BrowserUtil.getDriver());
                home.navigateToHomePage();
                Assert.assertEquals(BrowserUtil.getDriver().getCurrentUrl(), home.getURL());
    }
    
    @Test 
    public void TestRegstrationLink(){
                RegistrationPage registration = new RegistrationPage(BrowserUtil.getDriver());
                registration.navigateToRegistrationPage();
                Assert.assertEquals(BrowserUtil.getDriver().getCurrentUrl(), registration.getURL());
    }
    
    @AfterSuite
    public void tearDown(){
    	BrowserUtil.closeBrowser();
    }

}

