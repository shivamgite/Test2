package dav.SuiteBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import dav.PageFactory.HomePage;
import dav.PageFactory.RegistractionPage;
import dev.DriverFactory.DriverFactory;


public class Initialiation extends DriverFactory {
	
	public static  HomePage homepage =null;
	public static  RegistractionPage regPage = null;
	public static  DriverFactory driverFactory = null;
//	public static WebDriver driver;
	//TestClass1 testClass1 = new TestClass1();
	
	@BeforeSuite
	public void init() {
		homepage = new HomePage();
		regPage = new RegistractionPage();
		//driverFactory = new DriverFactory();
	}
	
}
