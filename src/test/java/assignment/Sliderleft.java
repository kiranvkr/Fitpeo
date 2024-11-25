package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basepack.BaseClass;

public class Sliderleft extends BaseClass {

	public void Sliderl() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        // Locate the text field and slider
	        WebElement textField = driver.findElement(By.xpath("//div[@class=\"MuiFormControl-root MuiTextField-root css-1s5tg4z\"]//input[1]")); // Replace with the actual text field locator
	        WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']"));

	        // Set the desired value in the text field
	        String desiredValue = "460";
	        textField.clear(); // Clear any existing value
	        textField.sendKeys(desiredValue); // Input the desired value

	        // Trigger the slider update if necessary
	        // This ensures that the slider moves dynamically based on the input value
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].dispatchEvent(new Event('input'));", textField);

	        // Optionally verify the slider's position or value
	        String sliderValue = slider.getAttribute("aria-valuenow"); // Example attribute; replace as per your DOM
	        if (sliderValue == null || sliderValue.isEmpty()) {
	            sliderValue = slider.getAttribute("value"); // Alternative attribute check
	        }

	        // Output the slider's updated value
	        System.out.println("Slider updated to value: " + sliderValue);

	        // Verify if the slider moved to the desired value
	        if (sliderValue.equals(desiredValue)) {
	            System.out.println("Slider moved correctly to: " + desiredValue);
	        } else {
	            System.out.println("Slider value mismatch! Expected: " + desiredValue + ", Actual: " + sliderValue);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } 	
	}
}
