package practise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.CheckOutPage;
import pageObjects.FormPage;
import pageObjects.OrderPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class EcommerceTest extends base {

	@Test
	public void FirstTest() throws IOException, InterruptedException {

    	startServer();

		AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FormPage formPage = new FormPage(driver);
		Actions actions = new Actions(driver);
		OrderPage orderPage = new OrderPage(driver);
		CheckOutPage checkOutPage = new CheckOutPage(driver);

		formPage.getSpinnerCountry().click();
		actions.ScrollIntoView("Belarus").click();
		formPage.getNameField().sendKeys("Jullia");
		formPage.getRadioFemale().click();
		formPage.getButtonLetsShop().click();
		orderPage.getButtonAddToCart().get(0).click();
		orderPage.getButtonAddToCart().get(0).click();
		orderPage.getButtonCart().click();
		Thread.sleep(4000);
		
		int count = checkOutPage.getProductPrice().size();
		double sum = 0;
		for(int i=0;i<count;i++) {
			
			String amount = checkOutPage.getProductPrice().get(i).getText();
			double am1 = getAmount(amount);
			sum= sum + am1;
		}
		
		System.out.println(sum);
		
		String totalAmount = checkOutPage.getTotalAmount().getText();
		double tA = getAmount(totalAmount);
		Assert.assertEquals(tA, sum);

		service.stop();
		
	}
	
	public static double getAmount(String value) {
		
		value = value.substring(1);
		double value1 = Double.parseDouble(value);
		return value1;
		
	}

}
