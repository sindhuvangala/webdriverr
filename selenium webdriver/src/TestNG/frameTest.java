package TestNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class frameTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("C:\\Users\\sindhuvangala\\Desktop\\frames.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.navigate().refresh();
	  driver.switchTo().frame("testng");
	  driver.findElement(By.linkText("IDEA")).click();
	  		
  }
  @BeforeTest
  public void beforeTest() {
  }

}
