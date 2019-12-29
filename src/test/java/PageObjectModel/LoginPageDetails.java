package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageDetails {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public LoginPageDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginDetails(String username, String password) {
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pswd.sendKeys(password);
	}
}