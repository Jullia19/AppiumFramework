package practise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PreferencesPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiDemosTest extends base {

	@Test(dataProvider = "InputData", dataProviderClass = TestData.class)
	public void SecondTest(String input) throws IOException, InterruptedException {

		startServer();

		AndroidDriver<AndroidElement> driver=Capabilities("ApiDemosApp");

		HomePage homePage = new HomePage(driver);
		PreferencesPage preferencesPage = new PreferencesPage(driver);

		homePage.getPreferences().click();
		preferencesPage.getPreferenceDependencies().click();
		preferencesPage.getCheckbox().click();
		preferencesPage.getRelativeLayout().click();
		preferencesPage.getEditText().sendKeys(input);
		preferencesPage.getButton().get(1).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Assert.assertEquals(1,2);

		service.stop();

	}


}
