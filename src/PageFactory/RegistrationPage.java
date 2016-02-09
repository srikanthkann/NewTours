package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPage {
	
	WebDriver driver;
    private static final String Reg_URL="http://newtours.demoaut.com/mercuryregister.php";
    
    public RegistrationPage(WebDriver driver) {
                this.driver=driver;
    }
    public void navigateToRegistrationPage() {
        driver.get(Reg_URL);
}
    public String getURL() {
        return Reg_URL;
}

    public void setFirstName(String firstName){
                driver.findElement(By.name("firstName")).sendKeys(firstName);
    }
	public void setLastName(String lastname) {
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		
	}
	public void setPhone(String phone) {
		driver.findElement(By.name("phone")).sendKeys(phone);
		
	}
	public void setUserName(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
		
	}
	public void setAddress(String address) {
		driver.findElement(By.name("address1")).sendKeys(address);
		
	}
	public void setCity(String city) {
		driver.findElement(By.name("city")).sendKeys(city);
		
	}
	public void setState(String state) {
		driver.findElement(By.name("state")).sendKeys(state);
		
	}
	public void setPostalcode(String postalcode ) {
		driver.findElement(By.name("postalCode")).sendKeys(postalcode);
		
	}
	public void setEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		
	}
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	public void setConfirmPassword(String confirmpassword) {
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
		
	}
	public void setRegisterButton(String registerbutton) {
		driver.findElement(By.name("register")).click();
		
	}
	public void setSignoff(String signoff) {
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
	}


}
