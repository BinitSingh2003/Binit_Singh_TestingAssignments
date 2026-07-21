package RadioButtonDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestScrollUp_Down {
	   WebDriver driver;
	    String url = "https://www.spicejet.com/";

	    @Test
	    public void Test() throws Exception {

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);

	        Thread.sleep(10000);

	        // Scroll down
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6600)");

	        Thread.sleep(6000);

	        // Scroll up
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)");

	        Thread.sleep(3000);

	        driver.quit();
	    }
}
