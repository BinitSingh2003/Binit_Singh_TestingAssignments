package WebDriver.NavigationCommand;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import statement for TestNG-
import org.testng.annotations.*;
public class NavigationCommands {
	@Test
	public void ChromeTest() {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}
	@Test
	public void FirefoxTest() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}
	
	@Test
	public void EdgeTest() {
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
	}

}
