package ecommerce_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ExecuteScript {
	
	 WebDriver driver;
		
	public void browserLogin() throws InterruptedException {
		       
		        //absolute path of the chrome driver
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VahiniGannavarapu\\Chrome_Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
			    driver.manage().window().maximize();
			    Thread.sleep(5000);

	}
	
	
	public void registerToWebsite() throws InterruptedException {
		  
		
         Thread.sleep(2000);
		 
		 WebElement loginBtn=driver.findElement(By.partialLinkText("Sign in"));
		 loginBtn.click();
		
		 
		 WebElement emailAddress=driver.findElement(By.id("email_create"));
		 WebElement subtBtn=driver.findElement(By.name("SubmitCreate"));
		 emailAddress.sendKeys("temple123@gmail.com");
		 subtBtn.click();
		 
		 //begin for registration
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 		  		
		//clicked the radio button
		 WebElement title=driver.findElement(By.xpath("//input[@id='id_gender2']"));
		 title.click();
		 
		 WebElement firstName=driver.findElement(By.id("customer_firstname"));
		 firstName.sendKeys("test");
		 
		 WebElement lastName=driver.findElement(By.id("customer_lastname"));
		 lastName.sendKeys("test");
		 
		
		 WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 email.clear();
		 email.sendKeys("temple123@gmail.com");
		 
		 WebElement password=driver.findElement(By.id("passwd"));
		 password.sendKeys("12345");
		 
		 //define Select constructors for dropdown elements
		 Select day=new Select(driver.findElement(By.id("days")));
		 //Select day=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")));
		 day.selectByValue("1");
		 
		 Select month=new Select(driver.findElement(By.id("months")));
		 //Select month=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")));
		 month.selectByValue("1");
		 
		 Select year=new Select(driver.findElement(By.id("years")));
		 //Select year=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")));
		 year.selectByValue("1980");
		 		 
		 Thread.sleep(3000);
		 
		 WebElement afirstName=driver.findElement(By.id("firstname"));
		 afirstName.sendKeys("test");
		 
		 WebElement aLastName=driver.findElement(By.id("lastname"));
		 aLastName.sendKeys("test");
		 
		 WebElement company=driver.findElement(By.id("company"));
		 company.sendKeys("company");
		 
		 Thread.sleep(3000);	
		 
		 WebElement address1=driver.findElement(By.id("address1"));
		 address1.sendKeys("addres1");
		 
		 WebElement address2=driver.findElement(By.id("address2"));
		 address2.sendKeys("Line2");
		 
		 WebElement city=driver.findElement(By.id("city"));
		 city.sendKeys("Ellicott City");
		 
		 Select state=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")));
		 state.selectByValue("20");
		 		 	 		 
		 WebElement postcode=driver.findElement(By.id("postcode"));
		 postcode.sendKeys("21042");
		 
		 Select country=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select")));
		 country.selectByValue("21");
		 
		 WebElement addInfo=driver.findElement(By.id("other"));
		 addInfo.sendKeys("additionalinfo");
		 
		 WebElement hmPhone=driver.findElement(By.id("phone"));
		 hmPhone.sendKeys("1234567890");
		 
		 WebElement mbPhone=driver.findElement(By.id("phone_mobile"));
		 mbPhone.sendKeys("1234567890");
		 		 
		 WebElement addAlias=driver.findElement(By.id("alias"));
		 addAlias.clear();
		 addAlias.sendKeys("ninja");
		 
		 Thread.sleep(3000);
		 
		 WebElement rgstrBtn=driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		 rgstrBtn.submit();
		 System.out.println("clicked o Register button...susccefully registered");
	}
	
	
	public void logWebsite() throws InterruptedException  {
		
		   
		
		Thread.sleep(2000);
		 
		 WebElement loginBtn=driver.findElement(By.partialLinkText("Sign in"));
		 loginBtn.click();
		 	
		 
		 WebElement  regstrEmail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 regstrEmail.sendKeys("temple123@gmail.com");
		 
		 WebElement  regstrPsswrd=driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		 regstrPsswrd.sendKeys("12345");
		 
		 WebElement  sgnBtn=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
		 sgnBtn.submit();
		 
		 Thread.sleep(2000);
		 System.out.println("Registered user successfully logged in");
	}
	
	void logoutBrowser() {
				  
		   driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		ExecuteScript obj=new ExecuteScript();
		obj.browserLogin();
		obj.registerToWebsite();
		obj.logWebsite();
		obj.logoutBrowser();

	}

}
