package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.ebay.com/");
		
		/*
		 * If application is so slow 
		 * If page is not fully loaded 
		 * It wait wait...
		 * But There are some limit
		 * Once limit is closed then give some exception....wait come into the picture
		 */
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		/*
		 * we are giving maximum 40 seconds to wait driver for page load
		 * this wait is dynamic in nature::if page load in 5 second rest of 35 second ignored
		 */
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*
		 * Implicit wait is for all the element
		 * It's Global wait
		 * Some time some button is coming after 3-5 second after page fully loaded properly (ajax)
		 * or some images are broken
		 * this Implicit wait is also dynamic in nature::
		 * if page load in 5 second rest of 2s5 second ignored
		 */
		
		//Static // hard wait
		//Thread.sleep(5000);
		//it wait for 5 second compulsory
		
	}

}
