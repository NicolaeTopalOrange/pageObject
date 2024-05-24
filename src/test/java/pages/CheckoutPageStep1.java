package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageStep1 extends BasePage {
    public CheckoutPageStep1(WebDriver webDriver) {
        super(webDriver);
        driver= webDriver;
    }

    //Locator
    By firstNameLocator = By.id("first-name");
    By lastNameLocator = By.id("last-name");
    By postalCodeLocator = By.id("postal-code");
    By continueButton = By.id("continue");


    public void waitPageIsLoaded(){
        waitElementIsClickable(continueButton);
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameFld = driver.findElement(firstNameLocator);
        firstNameFld.clear();
        firstNameFld.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        WebElement lastnameFld = driver.findElement(lastNameLocator);
        lastnameFld.clear();
        lastnameFld.sendKeys(lastName);
    }

    public void enterPostalCode(String postaCode) {
        WebElement postalCodeFld = driver.findElement(postalCodeLocator);
        postalCodeFld.clear();
        postalCodeFld.sendKeys(postaCode);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
}
