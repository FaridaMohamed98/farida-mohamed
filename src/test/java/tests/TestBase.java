package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+ "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+ "\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");	
	}

	@AfterSuite
	public void stopDriver() {
		driver.quit();
	}
}
