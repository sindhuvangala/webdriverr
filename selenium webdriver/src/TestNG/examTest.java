package TestNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class examTest {
	WebDriver driver;
  @Test(groups="browser")
  public void sindhu() {
	  System.setProperty("webdriver.chrome.driver", "D://selenium software//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
 @Test(groups="login")
 public void sindhu1() {
	 driver.findElement(By.id("email")).sendKeys("sindhuvangala1@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("anasurya");
	  }
	  
  
  @BeforeTest
  public void beforeTest() {
	  }
  }