package ecommerce_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverPathTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		//this is called the relative path of the driver
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/chrome_driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
