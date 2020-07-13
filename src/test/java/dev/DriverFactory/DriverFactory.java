package dev.DriverFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DriverFactory {

	public static WebDriver driver = null;

	@BeforeMethod
	public WebDriver createDriver() {
		try {
			long currTime = System.currentTimeMillis();
			// String driverPath =
			// "/home/dell/Desktop/ShivaJars/chromedriver_linux64/chromedriver";
			String driverPath = "Driver/chromedriver";
			// driverPath = driverPath+ "/" +"chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			String logFilePath = "/home/dell/shivaNewWorkspace/developmentDemo3/chromeLogPath/myChromeLOgs_" + currTime
					+ ".log";
			System.setProperty("webdriver.chrome.logfile", logFilePath);

			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);
			prefs.put("download.default_directory", "/home/dell/shivaNewWorkspace/developmentDemo3/downloadFiless");
			prefs.put("download.prompt_for_download", "false");
			prefs.put("download.extensions_to_open", "text/csv/image/pdf");
			prefs.put("safebrowsing.enabled", "false");
			options.setExperimentalOption("prefs", prefs);
			// Added below 4 options to overcome chrome initialization issue in automated
			// environment
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--ignore-certificate-errors");
			options.addArguments("--headless");

			// Temp code
			// options.addArguments( "--single-process" );
			// options.addArguments( "--enable-multiprocess" );
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability("disable-popup-blocking", false);
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(cap);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println("Error while creating a Chrome WebDriver: " + e.getMessage());
		}
		return driver;
	}

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
