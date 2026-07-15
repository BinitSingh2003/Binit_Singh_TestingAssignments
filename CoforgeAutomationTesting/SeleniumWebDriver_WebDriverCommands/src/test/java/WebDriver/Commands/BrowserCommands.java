package WebDriver.Commands;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserCommands {
	@Test
	public void ChromeBrowserTesting(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		driver.manage().window().maximize();//common step
		
		String Browsertitle=driver.getTitle();
		System.out.println(Browsertitle);
		
		String ActualValue= Browsertitle;
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
//		String PageSource=driver.getPageSource();
//		System.out.println(PageSource);
		
		String ExpectedValue="Practice Test Automation | Learn Selenium WebDriver";
		if(ActualValue.equals(ExpectedValue)) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		driver.quit();
	}
	
	@Test
	public void FirefoxBrowserTest() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();//common step
		
		String Browsertitle=driver.getTitle();
		System.out.println(Browsertitle);
		
		String ActualValue= Browsertitle;

		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
//		String PageSource=driver.getPageSource();
//		System.out.println(PageSource);
		
		String ExpectedValue="Selenium";
		if(ActualValue.equals(ExpectedValue)) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		driver.quit();
		
	}
	@Test
	public void EdgeBrowserTest() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.12.0");
		driver.manage().window().maximize();//common step
		
		String Browsertitle=driver.getTitle();
		System.out.println(Browsertitle);
		
		String ActualValue= Browsertitle;

		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
//		String PageSource=driver.getPageSource();
//		System.out.println(PageSource);
		
		String ExpectedValue="Just a moment...";
		
		if(ActualValue.equals(ExpectedValue)) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		driver.quit();
		
	}
}
