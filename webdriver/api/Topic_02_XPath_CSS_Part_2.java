package api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_XPath_CSS_Part_2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TC_01_Empty_Email_And_Password() {
		driver.get("https://live.demoguru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		//Empty Email
		driver.findElement(By.id("email")).sendKeys("");
		
		//Empty Password
		driver.findElement(By.name("login[password]")).sendKeys("");
		
		//Click button Login
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		
		//Expected text trả về = requirement
		Assert.assertEquals(driver.findElement(By.id("advice-required-entry-email")).getText(), "This is a required field.");
		Assert.assertEquals(driver.findElement(By.id("advice-required-entry-pass")).getText(), "This is a required field.");
	}
	@Test
	public void TC_02_Invalid_Email_Address() {
		driver.get("https://live.demoguru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		//Invalid Email
		driver.findElement(By.id("email")).sendKeys("12341234@12312.123123");
		
		//Password
		driver.findElement(By.name("login[password]")).sendKeys("123456");
		
		//Click button Login
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		
		//Expected text trả về = requirement
		Assert.assertEquals(driver.findElement(By.id("advice-validate-email-email")).getText(), "Please enter a valid email address. For example johndoe@domain.com.");
	}
	@Test
	public void TC_03_Invalid_Password() {
		driver.get("https://live.demoguru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

		//Email
		driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
		
		//Invalid Password < 6 characters
		driver.findElement(By.name("login[password]")).sendKeys("123");
		
		//Click button Login
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		
		//Expected text trả về = requirement
		Assert.assertEquals(driver.findElement(By.id("advice-validate-password-pass")).getText(), "Please enter 6 or more characters without leading or trailing spaces.");
	}
	@Test
	public void TC_04_Incorrect_Password() {
		driver.get("https://live.demoguru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		//Incorrect Email
		driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
		
		//Incorrect Password
		driver.findElement(By.name("login[password]")).sendKeys("123123123");
		
		//Click button Login
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		
		//Expected text trả về = requirement
		Assert.assertEquals(driver.findElement(By.xpath("//li[@class='error-msg']//span")).getText(), "Invalid login or password.");

	}
	
	@Test
	public void TC_05_Incorrect_Email() {
		driver.get("https://live.demoguru99.com/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		//Incorrect Email
		driver.findElement(By.id("email")).sendKeys("snownymph2912@gmail.com");
		
		//Incorrect Password
		driver.findElement(By.name("login[password]")).sendKeys("123123123");
		
		//Click button Login
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		
		//Expected text trả về = requirement
		Assert.assertEquals(driver.findElement(By.xpath("//li[@class='error-msg']//span")).getText(), "Invalid login or password.");

	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
