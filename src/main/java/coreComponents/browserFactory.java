package coreComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import basePackage.baseClass;

public class browserFactory extends baseClass {
	
	
	public static Properties prop;

	public browserFactory() {
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"C:\\Users\\Balajee\\eclipse-workspace\\com.UthraJK.WalesUserJourney\\src\\test\\resources\\GlobalSettings.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
/*	}else if(browserName.equalsIgnoreCase("FireFox"))
	{
		System.setProperty("webdriver.gecko.driver",
				"/com.UthraJK.WalesUserJourney/src/test/resources/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}else
	{
		System.setProperty("webdriver.IE.driver",
				"/com.UthraJK.WalesUserJourney/src/test/resources/Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	*/
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}	
	
	}
}