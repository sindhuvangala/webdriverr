package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D://selenium software//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	public void login() {
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium123");
		driver.findElement(By.id("u_0_2")).click();
	}
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Facebook_Login  s=new Facebook_Login();
	s.browser();
	s.login();
	} }
	