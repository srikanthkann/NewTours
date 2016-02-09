package DemoTourTestCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageFactory.RegistrationPage;
import Utility.BrowserUtil;


public class RegistrationPageLinks {

    
	@Test
    public void testRegistratrion(){
                RegistrationPage register = new RegistrationPage(BrowserUtil.getDriver());
                register.navigateToRegistrationPage();
                register.setFirstName("Srikanth");
                register.setLastName("Kannan");
                register.setPhone("3698521470");
                register.setUserName("srikanthkann@gmail.com");
                register.setAddress("test address");
                register.setCity("New York");
                register.setState("New York");
                register.setPostalcode("10001");
                register.setEmail("srikanth");
                register.setPassword("password");
                register.setConfirmPassword("password");
                register.setRegisterButton("RegisterButton");
                Assert.assertEquals(BrowserUtil.getDriver().findElement(By.xpath("//tr[3]/td/p[2]/font")).getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
                register.setSignoff("Signoff");              
    }
	private boolean assertEquals(String text, String string) {
		
		return false;
	}




}
