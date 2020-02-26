package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;

	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void CreateAccount() 
	{
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("niraj6@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

	}

}
