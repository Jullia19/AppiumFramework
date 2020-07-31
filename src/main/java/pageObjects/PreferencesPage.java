package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PreferencesPage {

    public PreferencesPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    private WebElement PreferenceDependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    private WebElement Checkbox;


    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    private WebElement RelativeLayout;

    @AndroidFindBy(className = "android.widget.EditText")
    private WebElement EditText;

    @AndroidFindBy(className = "android.widget.Button")
    private List<WebElement> Button;

    public WebElement getPreferenceDependencies() {
        return PreferenceDependencies;
    }

    public WebElement getCheckbox() {
        return Checkbox;
    }

    public WebElement getRelativeLayout() {
        return RelativeLayout;
    }

    public WebElement getEditText() {
        return EditText;
    }

    public List<WebElement> getButton() {
        return Button;
    }
}
