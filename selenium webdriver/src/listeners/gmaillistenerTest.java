package listeners;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
@Listeners(listeners.Listener2.class)
		
public class gmaillistenerTest {
	WebDriver driver;
  @Test
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","D://selenium software//chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
  }
  @BeforeTest
  public void beforeTest() {
  }

}
