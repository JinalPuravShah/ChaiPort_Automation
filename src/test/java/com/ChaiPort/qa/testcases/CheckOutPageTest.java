package com.ChaiPort.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ChaiPort.qa.base.TestBase;
import com.ChaiPort.qa.pages.CheckOutPage;
import com.ChaiPort.qa.pages.PaymentPage;

public class CheckOutPageTest extends TestBase{

	
	PaymentPage paymentpage;
	CheckOutPage checkoutpage;
	
	public CheckOutPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetUp() throws NullPointerException, IOException, InterruptedException {
		initialization();
		paymentpage =new PaymentPage ();
		checkoutpage =new CheckOutPage();
		checkoutpage = paymentpage.Validate_Amount();
		System.out.println("Amount Validations are correct");
		
	}
	
	@Test(priority=1)
	public void check() throws IOException, InterruptedException, AWTException{
		//checkoutpage = paymentpage.Validate_Amount();
		
		checkoutpage.Enter_Phone_No();
		System.out.println("Mobile Number is correctly inserted and Validated");
		//checkoutpage.Enter_Phone_No();
		//checkoutpage.VerifyCODPayment();
		//checkoutpage.VerifyCreditCardPayment();
		//checkoutpage.VerifyBNPLPayment();
		//checkoutpage.VerifyWalletsPayment();
	}
	
	
	@Test(priority=2)
	public void VerificationCOD() throws IOException, InterruptedException, AWTException{
		//checkoutpage = paymentpage.Validate_Amount();
		//checkoutpage.Enter_Phone_No();
		checkoutpage.VerifyCODPayment();
		System.out.println("Cash On Delivery Payment option not Working");
		//checkoutpage.VerifyCreditCardPayment();
		//checkoutpage.VerifyBNPLPayment();
		//checkoutpage.VerifyWalletsPayment();
	}
	

	@Test(priority=3)
	public void VerificationCreditCard() throws IOException, InterruptedException, AWTException{
		//checkoutpage = paymentpage.Validate_Amount();
		//checkoutpage.Enter_Phone_No();
		//checkoutpage.VerifyCODPayment();
		checkoutpage.VerifyCreditCardPayment();
		System.out.println("Not able to Test Credicard data as I dont have correct dummy data");
		//checkoutpage.VerifyBNPLPayment();
		//checkoutpage.VerifyWalletsPayment();
	}
	
	@Test(priority=4)
	public void VerificationBNPL() throws IOException, InterruptedException, AWTException{
		//checkoutpage = paymentpage.Validate_Amount();
		//checkoutpage.Enter_Phone_No();
		//checkoutpage.VerifyCODPayment();
		//checkoutpage.VerifyCreditCardPayment();
		//System.out.println("Not able to Test Credicard data as I dont have correct dummy data");
		checkoutpage.VerifyBNPLPayment();
		System.out.println("BNPL Payment Option giving error while copleting Transaction");
		//checkoutpage.VerifyWalletsPayment();
	}
	

	@Test(priority=5)
	public void VerificationWallets() throws IOException, InterruptedException, AWTException{
		//checkoutpage = paymentpage.Validate_Amount();
		//checkoutpage.Enter_Phone_No();
		//checkoutpage.VerifyCODPayment();
		//checkoutpage.VerifyCreditCardPayment();
		//checkoutpage.VerifyBNPLPayment();
		checkoutpage.VerifyWalletsPayment();
		System.out.println("Wallets Payment option working Fine");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
	//driver.quit();
	}
}
