package DemoTourTestCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.ReturnFlightBookingPage;
import Utility.BrowserUtil;


public class ReturnFlightBookingLink {
	
    
    @Test
    public void TestReturnFlight() throws InterruptedException{
    	ReturnFlightBookingPage returnflight = new ReturnFlightBookingPage(BrowserUtil.getDriver());
    	returnflight.navigateToReturnFlightBookingPage();
/*  	returnflight.setUserName("mercury");
 	returnflight.setPassword("mercury");
   	returnflight.setLogin("Login");*/
    	returnflight.loginIn("mercury", "mercury");
        Assert.assertTrue(returnflight.isSignOffDisplayed());
        returnflight.setDeparting("Frankfurt");
        returnflight.setContinue("findFlights");
        returnflight.setDepart("SelectFlight");
        returnflight.setReserveflight("reserveFlights");
        returnflight.setPassFirst0("Srikanth");
        returnflight.setPassLast0("Kannan");
        returnflight.setCreditcard("3210456987");
        returnflight.setBuyflight("buyFlights");
        Assert.assertEquals(BrowserUtil.getDriver().findElement(By.xpath("//font[2]")).getText(), "Your itinerary has been booked!");
        Assert.assertTrue(returnflight.isSignOffDisplayed());
        returnflight.setSignoff("Signoff");          
}


}
