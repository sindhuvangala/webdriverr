package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
		// TODO Auto-generated method stub
	WebDriver driver;
@Before
	public void browser() throws Exception {
	System.setProperty("webdriver.chrome.driver","D://selenium software//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.redbus.in");
}

	@After
	public void keyboard() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("//label[@for='src']")).sendKeys("mancherial");
		driver.findElement(By.id("//input[@id='dest']")).sendKeys("karimnagar");
		driver.findElement(By.id("//label[@for='onward_cal']")).click();
		driver.findElement(By.id("//label[@for='return_cal']")).click();
		driver.findElement(By.id("//button[@id='search_btn']")).click();
		}

	@Test
	public void test() throws Exception {
		redbus s=new redbus();
		s.browser();
		s.keyboard();
		}

}
