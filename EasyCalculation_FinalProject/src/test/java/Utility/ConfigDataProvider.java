package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		try {
			File src = new File("./Configuration/Config.properties");

			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			System.out.println("Unable to load Config File " + e.getMessage());
		}
	}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getURL() {
		return pro.getProperty("URL");
	}
	public String getLoginURL() {
	    return pro.getProperty("LoginURL");
	}

	public String getEmail() {
	    return pro.getProperty("Email");
	}

	public String getPassword() {
	    return pro.getProperty("Password");
	}
	public int getImplicitWait() {
		return Integer.parseInt(pro.getProperty("ImplicitWait"));
	}
	public int getPageLoadTime() {
		return Integer.parseInt(pro.getProperty("PageLoadTime"));
	}
}