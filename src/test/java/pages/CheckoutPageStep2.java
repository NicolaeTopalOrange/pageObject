package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageStep2 extends BasePage{

    public CheckoutPageStep2(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        }

        //Locator
        By finishButton = By.id("finish");
        By fleeceJacketItem = By.id("item_5_title_link");
        By fleeceJacketItemPrice = By.xpath("//*[@class='inventory_item_price' and text()='49.99']");


        public void isFleeceisPresent(){
            isElementAppear(fleeceJacketItem);
        }

        public void isFleeceItemPricePresent(){
            isElementAppear(fleeceJacketItemPrice);
        }

        public void isElementAppear(){
            isElementAppear(finishButton);
        }

        public void clickFinishButton(){
            driver.findElement(finishButton).click();
        }

    }

