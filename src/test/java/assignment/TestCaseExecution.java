package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepack.BaseClass;

public class TestCaseExecution extends BaseClass{
	
@Test
	
	public void TestCase1() throws InterruptedException {
		Scripting script = new Scripting();
		 script.SliderRight();
		 Thread.sleep(3000);
    }

@Test
	
	public void  TestCase3() throws InterruptedException {
		Scripting script = new Scripting();
		 script.SelectCheckboxes();
		 Thread.sleep(3000);
		
	}	
	@Test
	
	public void TestCase4() throws InterruptedException {
		Scripting script = new Scripting();
		 script.header();
		 Thread.sleep(3000);				
	}		
}



	


