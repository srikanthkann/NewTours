package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReturnFlightBookingPage extends SigninPage{
	
	

	WebDriver driver;
    private static final String Sign_URL="http://newtours.demoaut.com/mercurysignon.php";


    public ReturnFlightBookingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
    
    public void navigateToReturnFlightBookingPage() {
        driver.get(Sign_URL);
}

public String getURL() {
return Sign_URL;
}

public void navigateToReturnFlightBookingPage1() {
// TODO Auto-generated method stub

}

public void setUserName(String username) {
	driver.findElement(By.name("userName")).sendKeys(username);
	
}

public void setPassword(String password) {
	driver.findElement(By.name("password")).sendKeys(password);
	
}

public void setLogin(String login) {
	driver.findElement(By.name("login")).click();
	
}

public void setSignoff(String signoff) {
	driver.findElement(By.linkText("SIGN-OFF")).click();
	
}

public boolean isSignOffDisplayed(){
	return driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
}

public void setDeparting(String departing) {
	new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText(departing);
	
}

public void setContinue(String continuebutton) {
	driver.findElement(By.name("findFlights")).click();
	
}

public void setReserveflight(String reserveflight) {
	driver.findElement(By.name("reserveFlights")).click();
	
}

public void setPassFirst0(String passfirst) {
	driver.findElement(By.name("passFirst0")).sendKeys(passfirst);
	
}

public void setPassLast0(String passlast) {
	driver.findElement(By.name("passLast0")).sendKeys(passlast);
	
}

public void setCreditcard(String creditcard) {
	driver.findElement(By.name("creditnumber")).sendKeys(creditcard);
	
}

public void setBuyflight(String buyflight) {
	driver.findElement(By.name("buyFlights")).click();
	
}

public void setDepart(String depart) {
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")).click();
	
}


}
