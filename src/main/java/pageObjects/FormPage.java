package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    public FormPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    private WebElement SpinnerCountry;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement NameField;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    private WebElement RadioFemale;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement ButtonLetsShop;

    public WebElement getSpinnerCountry() {
        return SpinnerCountry;
    }

    public WebElement getNameField() {
        return NameField;
    }

    public WebElement getRadioFemale() {
        return RadioFemale;
    }

    public WebElement getButtonLetsShop() {
        return ButtonLetsShop;
    }
}
