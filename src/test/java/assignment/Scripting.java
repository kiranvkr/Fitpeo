package assignment;

import java.time.Duration;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scripting extends TestCaseExecution {
	



public void SliderRight() {
			try {
					WebElement slider = driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-j7qwjs\"]//span[3]"));
					WebElement sliderHandle= driver.findElement(By.xpath("//div[@class=\"MuiFormControl-root MuiTextField-root css-1s5tg4z\"]//input[1]"));
					Actions act = new Actions(driver);
					act.dragAndDropBy(slider, 94, 0).perform();
					Thread.sleep(2000);
					act.dragAndDropBy(slider, -39, 0).perform();
					Thread.sleep(2000);
					act.dragAndDropBy(slider, 39, 0).perform();
		          
			} catch (Exception e) {
				System.out.println("An error occurred: " + e.getMessage());
				}
			
		}

public void SelectCheckboxes() {

	try{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int[] indexesToSelect = {0, 1, 2, 7}; 
   
    for (int i = 0; i < checkboxes.size(); i++) {
        if (isIndexInArray(i, indexesToSelect) && !checkboxes.get(i).isSelected()) {
            checkboxes.get(i).click();
            System.out.println("Selected checkbox at index: " + i);
        }
	
}
}
	catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
}	
	
}

private static boolean isIndexInArray(int index, int[] array) {


	for (int value : array) {
        if (index == value) {
            return true;
        }
    }
    return false;
}


public void header() {

	
	try {
		
        // Define the locator for the header
        By headerLocator = By.xpath("//div[@class=\"MuiBox-root css-rfiegf\"]//p[4]"); // Update with the actual header locator

        // Wait for the header to become visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(headerLocator));

        // Get the initial value of the header
        String initialHeaderValue = header.getText();
        System.out.println("Initial Header Value: " + initialHeaderValue);

        // Wait for the header value to change
        wait.until(driver1 -> {
            String newValue = driver1.findElement(headerLocator).getText();
            return !newValue.equals(initialHeaderValue); // Wait until the value changes
        });

        // Get the updated header value
        String updatedHeaderValue = driver.findElement(headerLocator).getText();
        System.out.println("Updated Header Value: " + updatedHeaderValue);

    } catch (Exception e) {
        e.printStackTrace();
    } 
}



}
	
