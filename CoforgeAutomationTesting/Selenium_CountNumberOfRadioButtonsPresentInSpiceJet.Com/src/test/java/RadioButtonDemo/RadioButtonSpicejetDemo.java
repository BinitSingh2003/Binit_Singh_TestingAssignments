package RadioButtonDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonSpicejetDemo {
	@Test
	public void RadioButton() throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[name()='circle'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='circle'])[10]")).click();
		Thread.sleep(2000);
		
		 List<WebElement> circleElements = driver.findElements(By.xpath("//*[name()='circle']"));
		
		//Print each Button's Details===
		
		System.out.println("=====Radio Buttons Details===");
		for(int i=0;i<circleElements.size();i++) {
			WebElement element=circleElements.get(i);
			System.out.println("Button " + (i + 1) + ":");
            System.out.println(" - Tag: " + element.getTagName());
            System.out.println(" - Displayed: " + element.isDisplayed());
            System.out.println(" - Enabled: " + element.isEnabled());
            System.out.println(" - Class: " + element.getAttribute("class"));
            System.out.println(" - Role: " + element.getAttribute("role"));
            System.out.println(" - Aria-checked: " + element.getAttribute("aria-checked"));
            System.out.println("------------------------------------------");
		}
		driver.quit();
		
	
	}
}
