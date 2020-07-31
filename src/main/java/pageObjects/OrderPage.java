package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage {

    public OrderPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//*[@text='ADD TO CART']")
    private List<WebElement> ButtonAddToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement ButtonCart;

    public List<WebElement> getButtonAddToCart() {
        return ButtonAddToCart;
    }

    public WebElement getButtonCart() {
        return ButtonCart;
    }
}

