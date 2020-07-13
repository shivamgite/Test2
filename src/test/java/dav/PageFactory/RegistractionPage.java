package dav.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegistractionPage{
	
	String FstHlfXpath = "//*[contains(text(),'";
	String ScndHlfXpath = "')]/parent::*/parent::*/following-sibling::*/child::*";;
	
	public void FirstNameField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"First"+ScndHlfXpath)).sendKeys("shivam");
		
	}
	public void LastNameField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Last"+ScndHlfXpath)).sendKeys("gite");
		
	}
	public void PhoneField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Phone"+ScndHlfXpath)).sendKeys("7974862384");
		
	}
	public void EmailField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Email"+ScndHlfXpath)).sendKeys("xyz@gmail.com");
		
	}
	public void AddressField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Address"+ScndHlfXpath)).sendKeys("abc def ghi ");
		
	}
	public void CityField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"City"+ScndHlfXpath)).sendKeys("bhopal");
		
	}
	public void StateField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"State/Province"+ScndHlfXpath)).sendKeys("madhya predesh");
		
	}
	public void PostalCodeField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Postal"+ScndHlfXpath)).sendKeys("462023");
		
	}
	public void CountryField(WebDriver driver) {
		WebElement countrySelect = driver.findElement(By.xpath(FstHlfXpath+"Country"+ScndHlfXpath));
		Select select = new Select(countrySelect);
		select.selectByValue("92");
		
	}
	public void UserNameField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"User"+ScndHlfXpath)).sendKeys("shivam");
		
	}
	public void PasswordField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Password"+ScndHlfXpath)).sendKeys("shivam123");
		
	}
	public void ConfirmPasswordField(WebDriver driver) {
		driver.findElement(By.xpath(FstHlfXpath+"Confirm"+ScndHlfXpath)).sendKeys("shivam123");
		
	}
	public void SubmitButton(WebDriver driver) {
		driver.findElement(By.name("register")).click();
		
	}
	
}
