package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	
	WebDriver driver;
    private static final String Sign_URL="http://newtours.demoaut.com/mercurysignon.php";

    public SigninPage(WebDriver driver) {
                this.driver=driver;
    }
    
    public void navigateToSigninPage() {
        driver.get(Sign_URL);
}

public String getURL() {
return Sign_URL;
}

public void navigateToSigninPage1() {
// TODO Auto-generated method stub

}

public void setUserName(String username) {
	driver.findElement(By.name("userName")).sendKeys(username);
	
}

public void setPassword(String password) {
	driver.findElement(By.name("password")).sendKeys(password);
	
}

public void setLogin() {
	driver.findElement(By.name("login")).click();
	
}

public void setSignoff() {
	driver.findElement(By.linkText("SIGN-OFF")).click();
	
}

public boolean isSignOffDisplayed(){
	return driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
}

public void loginIn(String userName,String Password){
	setUserName(userName);
	setPassword(Password);
	setLogin();
	
}

}
