package minitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SimpleTest {

	@Test
	public void logincreate() {
		
		//To set the driver
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				//To launch chrome
				ChromeDriver driver = new ChromeDriver();
				//To delete chromedriver In run window taskkill /f /im chromedriver.exe
				
				//to maximize the browser
				
			
				// To load the url
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://acme-test.uipath.com/account/login");
		
				driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
				driver.findElementById("password").sendKeys("leaf@12");
				driver.findElementById("buttonLogin").click();
				
				Actions builder = new Actions(driver);
				
			   WebElement vendors = driver.findElementByXPath("(//div[@class='dropdown']//button)[5]");
			//	builder.moveToElement(vendors);
			   builder.moveToElement(vendors).perform();
				WebElement searchvendor = driver.findElementByLinkText("Search for Vendor");
				
				searchvendor.click();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		 WebElement findcountry = driver.findElementByXPath("/html/body/div/div[2]/div/table/tbody/tr[2]/td[5]");
		System.out.println(findcountry.getText());
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
				
				
				
		
	}
	
	
}
