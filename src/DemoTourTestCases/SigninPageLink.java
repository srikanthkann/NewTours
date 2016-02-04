package DemoTourTestCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.SigninPage;
import Utility.BrowserUtil;

public class SigninPageLink {


	@Test
	public void TestSignin() throws InterruptedException{
		SigninPage signin = new SigninPage(BrowserUtil.getDriver());
		signin.navigateToSigninPage();
		signin.loginIn("mercury", "mercury");
		Assert.assertEquals(BrowserUtil.getDriver().findElement(By.xpath("//tr[3]/td/font")).getText(), "Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.");
		Assert.assertTrue(signin.isSignOffDisplayed());
		Thread.sleep(1000);
		signin.setSignoff();          
	}

}
