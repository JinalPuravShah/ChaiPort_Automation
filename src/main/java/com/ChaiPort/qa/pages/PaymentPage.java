package com.ChaiPort.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ChaiPort.qa.base.TestBase;
import com.ChaiPort.qa.util.TestUtil;

public class PaymentPage extends TestBase {
	
	
	

	@FindBy(xpath="//*[@id=\"mySelect\"]")
    WebElement Select_Country;
	
	@FindBy(xpath="//li[@data-value=\"en\"]")
	WebElement Select_English;
	
	@FindBy(xpath="//input[@id=\"amount\" and @name=\"amount\"]")
	WebElement Amount;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/div[1]/div[3]/button")
	WebElement Pay_Now;
	

	public PaymentPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
	 
	public void SelectCountry() throws InterruptedException {
		Select_Country.click();
		Thread.sleep(2000);
		Select_English.click();
}
	
	
	public CheckOutPage Validate_Amount() throws InterruptedException, IOException {
		Select_Country.click();
		Thread.sleep(2000);
		Select_English.click();
		Thread.sleep(3000);
		
		Amount.click();
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		a.moveToElement(Amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		Amount.sendKeys("100000");
		Pay_Now.click();
		
		
		
		Amount.click();
		Thread.sleep(3000);
		a.moveToElement(Amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		Amount.sendKeys("100");
		Pay_Now.click();
		
		return new CheckOutPage();
	}
	 }
