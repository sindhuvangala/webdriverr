package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubesearch {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver","D://selenium software//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();}
	public void search() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.name("search_query")).sendKeys("leapacademy");
	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Youtubesearch  s=new Youtubesearch();
		s.browser();
		s.search();
	}
	}
