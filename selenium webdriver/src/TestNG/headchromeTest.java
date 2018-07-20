package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class headchromeTest {
	WebDriver driver;
  @Test
  public void f(){
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("window-size=1400,800");
	  options.addArguments("headless");
	  driver=new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php");
	  System.out.println("the page title is:+driver.gettitle");
	  driver.quit();
	  System.out.println("the browser closed");		  
  }
  @BeforeTest
  public void beforeTest() {
  }

}
