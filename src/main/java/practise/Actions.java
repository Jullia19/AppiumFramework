package practise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

public class Actions {

    AndroidDriver driver;

    public Actions(AndroidDriver<AndroidElement> driver){

        this.driver = driver;

    }

    public WebElement ScrollIntoView(String scrollText){

        WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+scrollText+"\"));");
        return element;
    }
}
