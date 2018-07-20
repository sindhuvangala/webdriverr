package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  paytm_login {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://paytm.com");
		driver.manage().window().maximize();
	}
	public void login() {
		driver.findElement(By.id("Choose Language")).click();
		driver.findElement(By.id("Registered Paytm Mobile Number")).sendKeys("8790223063 ");
		driver.findElement(By.id("password")).sendKeys("sindhu");
		driver.findElement(By.id("login_btn")).click();
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			paytm_login p=new paytm_login();
			p.browser();
			p.login();
			
	}

}
