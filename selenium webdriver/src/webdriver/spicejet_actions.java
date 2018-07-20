package webdriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class spicejet_actions {
	WebDriver driver;
	
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","D://selenium software//chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("http://www.spicejet.com/");
		driver.manage().window().maximize();}
	
	public void actions() 
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.linktext("ADD_ONS"))).build().perform();
		a.moveToElement(driver.findElement(By.id("header-addons"))).build().perform();}
	public void keyboard()throws InterruptedException
	{
		driver.findElement(By.linkText("Red Hot Offers")).click();
		Actions a1=new Actions(driver);
		
		a1.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();		
		Thread.sleep(3000);
	}
		// TODO Auto-generated method stub}
    public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
 spicejet_actions s=new project_actions();
 s.browser();
 s.actions();
 s.keyboard();
 
	}

}
