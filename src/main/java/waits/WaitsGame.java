package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsGame {
	//https://www.youtube.com/watch?v=SxgL2L1cZRI
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//Implicit Waits
		//Global wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//find element
		//find elements
		//dynamic wait
		//if element found in 2 seconds rest of 8 seconds will give away 
		//if not - element not found exception
		//Local code>remote server>language binding>executable driver
		
		//Explicit wait
		//no keyword for explicit wait 
		//it will be executed directly on the client machine
		//if element found in 2 seconds rest of 8 seconds will ignore
		//it has polling mechanism

		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		//Difference
		
		/*
		 * 
		 * Exp Wait						|			Imp Wait
		 * Very well documented and		|	Undocumented and undefined behaviour
		 * Defined behaviour			|
		 * 								|
		 * Runs at local part of		|	Runs on Remote side of selenium webdriver
		 * the selenium code			|
		 * 								|
		 * Customise it					|	Can not customise it/global
		 * 								|
		 * Not only for web elements	|	Only works for findElement(s)
		 * also for other options		|
		 * 
		 * ignore the exceptions
		 * 
		 * 
		 * 
		 * Share will mi then ?
		 * 
		 * If Mix then ? :-- first apply imp wait then explicit wait
		 * 
		 * if you have to mix then use nullify implicit wait
		 *  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 *  webdriverwait = 10
		 *  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */
	}

}
