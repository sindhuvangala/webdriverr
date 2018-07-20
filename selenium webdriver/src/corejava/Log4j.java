package corejava;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.org.apache.xerces.internal.utils.XMLSecurityPropertyManager.Property;

import TestNG.chromedriverTest;

public class Log4j {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chromedriver.exe");
		driver=new ChromeDriver();
		Logger log=Logger.getLogger("Log4j"); // log4j class declaration
		PropertyConfigurator.configure("log4j.properties");
		driver.get("http://www.google.com");
		log.info("url inserted");
		driver.manage().window().maximize();
		log.info("browser maximized");
		
			
	}

}
