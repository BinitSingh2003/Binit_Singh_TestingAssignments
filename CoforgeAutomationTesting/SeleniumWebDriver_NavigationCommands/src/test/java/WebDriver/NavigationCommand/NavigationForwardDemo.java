package WebDriver.NavigationCommand;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class NavigationForwardDemo {
	public void ChromeTestNavigationForward() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://mvnrepository.com/artifact/junit/junit");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
	}
	@Test
	public void FirefoxTestNavigationForward() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://mvnrepository.com/artifact/junit/junit");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void EdgeTestNavigationForward() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://mvnrepository.com/artifact/junit/junit");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
   }
	
	@Test
	public void NavigationRefreshMethod() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		driver.navigate().refresh();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.quit();
	}
}
