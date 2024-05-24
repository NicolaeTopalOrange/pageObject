package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    //Locator
    By bagItem = By.id("item_4_title_link");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
        driver =webDriver;
    }

    public void isBagIsPresent(){
        isElementAppear(bagItem);
    }


}
