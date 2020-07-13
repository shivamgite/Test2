package dav.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	String HomePage = "//*[text()='Home']";
	String Register = "//*[text()='REGISTER']";
	
	
	
	public void HomeButton(WebDriver driver) {
		driver.findElement(By.xpath(HomePage)).click();
	}
	public void RegisterButton(WebDriver driver) {
		driver.findElement(By.xpath(Register)).click();
	}
	
}
