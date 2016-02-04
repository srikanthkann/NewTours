package PageFactory;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
    WebDriver driver;
    private static final String HOME_URL="http://newtours.demoaut.com/mercurywelcome.php";

    public HomePage(WebDriver driver) {
                this.driver=driver;
    }

    //public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	//}

	public void navigateToHomePage() {
                driver.get(HOME_URL);
    }

   public String getURL() {
		return HOME_URL;
	}

public void navigateToHomePage1() {
	// TODO Auto-generated method stub
	
}


}
