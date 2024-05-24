package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    //Locator
    By bagItem = By.id("item_4_title_link");
    By checkoutButton = By.id("checkout");
    By fleeceJacketItem = By.id("item_5_title_link");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
        driver =webDriver;
    }


    //bag item
    public void isBagIsPresent(){
        isElementAppear(bagItem);
    }

    //fleece jacket
    public void isFleeceisPresent(){
        isElementAppear(fleeceJacketItem);
    }

    public void clickCheckoutButton(){
        waitElementIsClickable(checkoutButton);
        driver.findElement(checkoutButton).click();
    }



}
