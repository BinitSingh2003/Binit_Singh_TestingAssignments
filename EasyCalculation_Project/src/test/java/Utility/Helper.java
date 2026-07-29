package Utility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Helper {
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destination = new File("./ScreenShots/" + screenshotName + ".png");

			FileUtils.copyFile(src, destination);

			System.out.println("Screenshot Saved Successfully");
		}
		catch (IOException e) {

			System.out.println("Unable to capture screenshot");
		}
	}
	public static String getCurrentDateTime() {

		return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	}
	public static void implicitWait(WebDriver driver, int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
	}
}
