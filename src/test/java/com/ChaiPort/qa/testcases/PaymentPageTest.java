package com.ChaiPort.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ChaiPort.qa.base.TestBase;
import com.ChaiPort.qa.pages.CheckOutPage;
import com.ChaiPort.qa.pages.PaymentPage;


public class PaymentPageTest extends TestBase{

	PaymentPage paymentpage;
	CheckOutPage checkoutpage;
	
	public PaymentPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetUp() throws NullPointerException, IOException {
		initialization();
		paymentpage =new PaymentPage ();
	}
	
	@Test(priority=1)
	public void CountryTest() throws IOException, InterruptedException{
		paymentpage.SelectCountry();
		
	}
		
		@Test(priority=2)
		public void validation() throws IOException, InterruptedException{
			checkoutpage = paymentpage.Validate_Amount();
		}

	@AfterMethod
	public void tearDown() {
	//driver.quit();
	}
}