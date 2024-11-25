package Basepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Eclipse workspace\\Maven_Fitpro\\DataFile\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fitpeo.com/");
        Thread.sleep(2000);
        WebElement revenue = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
		revenue.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
        //driver.get("https://fitpeo.com/revenue-calculator");
        
		}
		
	
}