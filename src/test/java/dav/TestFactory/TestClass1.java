package dav.TestFactory;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dav.PageFactory.HomePage;
import dav.PageFactory.RegistractionPage;
import dav.SuiteBase.Initialiation;
import dev.DriverFactory.DriverFactory;

public class TestClass1 extends Initialiation {
	//WebDriver driver = null;
	/*WebDriver driver;
	 HomePage homepage;
	 RegistractionPage regPage;
	 DriverFactory driverFactory;*/
	
	@Test
	public void operations() {
		try {
			
			//driver = driverFactory.createDriver();
			driver.get("http://newtours.demoaut.com/");
			homepage.HomeButton(driver);
			homepage.RegisterButton(driver);
			regPage.FirstNameField(driver);
			regPage.LastNameField(driver);
			regPage.PhoneField(driver);
			regPage.EmailField(driver);
			regPage.AddressField(driver);
			regPage.CityField(driver);
			regPage.StateField(driver);
			regPage.PostalCodeField(driver);
			regPage.CountryField(driver);
			regPage.UserNameField(driver);
			regPage.PasswordField(driver);
			regPage.ConfirmPasswordField(driver);
			regPage.SubmitButton(driver);
			System.out.println("Test success");
			
			//driverFactory.closeDriver();
			System.out.println("Broower cloased");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
