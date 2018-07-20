package listeners;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
@Listeners(listeners.ItestListener.class)
public class ListenerTest {
	WebDriver driver;
  @Test
  public void  browser() {
	  System.setProperty("webdriver.chrome.driver", "D://selenium software//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  }
  @BeforeTest
  public void beforeTest() {
  }

}
