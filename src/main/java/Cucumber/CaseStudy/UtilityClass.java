package Cucumber.CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass {

	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.IEDriverServer.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\chrome\\chromedriver.exe");
	        driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
