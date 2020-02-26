package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginClick() {
		WebElement Home = driver.findElement(By.xpath("//a[@class='login']"));
		Home.click();
	
	}

}
