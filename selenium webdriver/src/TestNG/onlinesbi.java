package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class onlinesbi  {
	WebDriver driver;
  @Test
  public void f() {
	  onlinesbi s=new onlinesbi();
	   s=browser();
	  }
	
  @BeforeTest
  public void  browser() {
	  System.setProperty("webdriver.chrome.driver", "D://selenium software//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.onlinesbi.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }
	  
  }
  


