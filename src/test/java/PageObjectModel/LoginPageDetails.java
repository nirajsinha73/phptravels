package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageDetails {

	WebDriver driver;
	

	public LoginPageDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginDetails(String username, String password)
	{
	
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pswd.sendKeys(password);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement email1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
		email1.click();

		
	}
}