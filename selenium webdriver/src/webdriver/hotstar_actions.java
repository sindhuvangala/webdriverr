package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hotstar_actions {
	WebDriver driver;
	Actions a=Actions(driver);
		// TODO Auto-generated move to stub
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D://selenium software//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.hotstar.com");
		driver.manage().window().maximize();
	}
	public void actions() {
		//a.moveToElement(driver.findelement(By.linktext("SEARCH"))).build.perform();
		a.moveToElement(driver.findElement(By.id("input-open"))).sendKeys("calling bell movie");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	public void keyboard() {
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build();
			}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		hotstar_actions s=new hotstar_actions();
		s=browser();
		s=Actions();
		s=keyboard();
	}
}
