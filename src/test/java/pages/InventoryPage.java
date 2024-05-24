package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends BasePage {
    WebDriver driver;

     //Locator
    By addToCartBagLocator = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    By addToCartFleeceLocator = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By cartLocator = By.className("shopping_cart_link");

    public InventoryPage(WebDriver webDriver){
        super(webDriver);
        driver = webDriver;

    }
    public void waitPageIsLoaded(){
        waitElementIsClickable(addToCartBagLocator);
    }

    // Add Bag To Cart
    public void addBagToCart(){
        driver.findElement(addToCartBagLocator).click();
    }

    public void navigateToCart(){
        driver.findElement(cartLocator).click();
    }

    //Add Fleece To Cart
    public void waitPageIsLoaded2() {
        waitElementIsClickable(addToCartFleeceLocator);
    }
    public void addFleeceToCart(){
        driver.findElement(addToCartFleeceLocator).click();
    }

    public void navigateToCart2() {
        driver.findElement(cartLocator).click();
    }
}

