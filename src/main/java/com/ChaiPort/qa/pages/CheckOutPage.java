package com.ChaiPort.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ChaiPort.qa.base.TestBase;

public class CheckOutPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"savedPaymentOptionWeb\"]")
	WebElement Get_Saved_Card;
	
	@FindBy(xpath="//div[@aria-activedescendant=\"iti-1__item-vn-preferred\"]")
	WebElement Country_Dropdown;
	
	
	@FindBy(xpath="//li[@id=\"iti-1__item-in-preferred\"]")
	WebElement Select_India;
	
	@FindBy(xpath="//input[@style=\"padding-left: 86px;\"]")
	WebElement Insert_MobileNo;
	
	@FindBy(xpath="//button[@class=\"btn btn-block customProceed\"]")
	WebElement Next;
	
	
	@FindBy(xpath="//input[@id=\"otp1\"]")
	WebElement OTP1;
	
	@FindBy(xpath="//input[@id=\"otp2\"]")
	WebElement OTP2;
	
	@FindBy(xpath="//input[@id=\"otp3\"]")
	WebElement OTP3;
	
	@FindBy(xpath="//input[@id=\"otp4\"]")
	WebElement OTP4;
	
	@FindBy(xpath="//input[@id=\"otp5\"]")
	WebElement OTP5;
	
	@FindBy(xpath="//input[@id=\"otp6\"]")
	WebElement OTP6;
	
	@FindBy(xpath="//*[@id=\"otpToPayment\"]")
	WebElement Verify_OTP;
	
	
	@FindBy(xpath="//*[@id=\"paymentMode\"]/div[10]")
	WebElement COD;
	
	@FindBy(xpath="//*[@id=\"PayNowButtonWeb\"]")
	WebElement Pay_Now;
	
	@FindBy(xpath="//*[@id=\"CreditCardOptParent\"]")
	WebElement CreditCardPay;
	
	@FindBy(xpath="//input[@id=\"CardNumber\"]")
	WebElement CardNo;
	
	@FindBy(xpath="//input[@id=\"CardHolderName\"]")
	WebElement CardHolderName;
	
	@FindBy(xpath="//input[@id=\"validthru\"]")
	WebElement ExpiryDate;
	
	@FindBy(xpath="//input[@id=\"creditCvv\"]")
	WebElement CVV;
	
	
	@FindBy(xpath="//*[@id=\"CreditCard\"]/div/form/div[4]")
	WebElement CheckBox;
	
	@FindBy(xpath="//button[@id=\"PayNowButtonWeb\"]")
	WebElement PAYSGD;
	
	@FindBy(xpath="//div[@aria-activedescendant=\"iti-2__item-vn-preferred\"]")
	WebElement Countrycode2;
	
	@FindBy(xpath="//li[@id=\"iti-2__item-in-preferred\"]")
	WebElement SelectIndia2;
	
	@FindBy(xpath="//input[@placeholder=\"81234 56789\"]")
	WebElement Mobile2;
	
	@FindBy(xpath="//button[@id=\"failpoplang4\"]")
	WebElement ContinuePayment;
	
	@FindBy(xpath="//button[@id=\"failpoplang3\"]")
	WebElement CancelPayment;
	
	
	@FindBy(xpath="//*[@id=\"bnplsOptParent\"]")
	WebElement BNPL;
	
	@FindBy(xpath="//input[@value=\"wallets-ATOME-ATOME_BNPL\"]")
	WebElement Atome;
	
	@FindBy(xpath="//button[@id=\"PayNowButtonWeb\"]")
	WebElement PayNow3;
	
	@FindBy(xpath="//button[@id=\"failpoplang3\"]")
	WebElement Cancel2;
	
	@FindBy(xpath="//*[@id=\"walletsOptParent\"]")
	WebElement Wallets;
	
	@FindBy(xpath="//input[@id=\"OMISE-OMISE_PAYNOW\"]")
	WebElement PAYNOW;
	
	@FindBy(xpath="//button[@id=\"PayNowButtonWeb\"]")
	WebElement WalletsPay;
	
	@FindBy(xpath="//*[@id=\"qrcode-image1\"]/button/div")
	WebElement DOWNLOADQR;
	
	
	public CheckOutPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	 
	public void Enter_Phone_No() throws IOException, InterruptedException {
		Get_Saved_Card.click();
		Thread.sleep(3000);
		Country_Dropdown.click();
		Thread.sleep(2000);
		Select_India.click();
		Thread.sleep(2000);
		Insert_MobileNo.sendKeys("9284364064");
		Thread.sleep(2000);
		Next.click();
		OTP1.sendKeys("1");
		OTP2.sendKeys("2");
		OTP3.sendKeys("3");
		OTP4.sendKeys("4");
		OTP5.sendKeys("5");
		OTP6.sendKeys("6");
		Verify_OTP.click();
	}
	
	public void VerifyCODPayment() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		COD.click();
		Pay_Now.click();
		Thread.sleep(5000);
		driver.navigate().back();
}
	
	public void VerifyCreditCardPayment() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		CreditCardPay.click();
		CardNo.click();
		CardNo.sendKeys("5267 3181 8797 5449");
		CardHolderName.sendKeys("ABCD");
		ExpiryDate.sendKeys("122022");
		CVV.sendKeys("123");
		Thread.sleep(3000);
		CheckBox.click();
		PAYSGD.click();
		Thread.sleep(3000);
		Countrycode2.click();
		SelectIndia2.click();
		Thread.sleep(3000);
		Mobile2.click();
		Mobile2.sendKeys("9284364064");
		Thread.sleep(3000);
		ContinuePayment.click();
		Thread.sleep(5000);
		CancelPayment.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	public void VerifyBNPLPayment() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	    Thread.sleep(5000);
	    BNPL.click();
	    Thread.sleep(4000);
        Atome.click();
        robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        PayNow3.click();
        Cancel2.click();
        Thread.sleep(4000);
		driver.navigate().back();
	}
	
	
	public void VerifyWalletsPayment() throws IOException, InterruptedException, AWTException {
		Wallets.click();
		Thread.sleep(2000);
		PAYNOW.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		WalletsPay.click();
		Thread.sleep(3000);
		DOWNLOADQR.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
}
}
