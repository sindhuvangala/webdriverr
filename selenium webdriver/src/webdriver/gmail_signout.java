package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class gmail_signout {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver","D://selenium software//chromedriver.exe" );
	driver=new ChromeDriver();
	driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.manage().window().maximize();
	}
	public void gmail() {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sindhuvangala1@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='passwordNext']//div[@class='ZFr60d CeoRYc']")).click();
	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	gmail_signout s=new gmail_signout();
	s.browser();
	s.gmail();

	
}
}
