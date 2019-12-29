package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpDetails 
{
	WebDriver driver;
	public SignUpDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SignUp() 
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement RadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		RadioButton.click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("niraj");
		
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("sinha");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).clear();
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("nirajsinha");

		driver.findElement(By.id("days")).sendKeys("12");
		driver.findElement(By.id("months")).sendKeys("August");
		driver.findElement(By.id("years")).sendKeys("1992");
		
//		Select dropdown = new Select(driver.findElement(By.id("//select[@id='days']")));
//		dropdown.selectByIndex(20);

//		Select dropdown1 = new Select(driver.findElement(By.id("//select[@id='months']")));
//		dropdown1.selectByIndex(8);
//
//		Select dropdown2 = new Select(driver.findElement(By.id("//select[@id='years']")));
//		dropdown2.selectByIndex(1992);
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("niraj");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sinha");
		
		driver.findElement(By.xpath("//input[@id='address1']")).clear();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("KUNDANHALLI BANGALORE");
		
		driver.findElement(By.xpath("//input[@id='address2']")).clear();
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("KARNATAKA");
		
		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
		
		driver.findElement(By.id("id_state")).sendKeys("Iowa");
		
		driver.findElement(By.id("postcode")).sendKeys("72201");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("other")).sendKeys("Hi welcome to automation practice");
		driver.findElement(By.id("phone_mobile")).sendKeys("9461112909");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Register done");

	}

}


