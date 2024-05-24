package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TestStore extends BaseTest {


    @Test
    public void addToCart() {

        AuthPage authPage = new AuthPage(driver);
        authPage.open();
        authPage.waitPageIsLoaded();
        authPage.enterUserName("standard_user");
        authPage.enterPassword("secret_sauce");
        authPage.clickToLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.waitPageIsLoaded();
        inventoryPage.addBagToCart();
        inventoryPage.navigateToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.isBagIsPresent();

    }

    @Test
    public void fleeceCheckout() {
        AuthPage authPage = new AuthPage(driver);
        authPage.open();
        authPage.waitPageIsLoaded();
        authPage.enterUserName("standard_user");
        authPage.enterPassword("secret_sauce");
        authPage.clickToLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.waitPageIsLoaded();
        inventoryPage.addFleeceToCart();
        inventoryPage.navigateToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.isFleeceisPresent();
        cartPage.clickCheckoutButton();

        CheckoutPageStep1 checkoutPageStep1 = new CheckoutPageStep1(driver);
        checkoutPageStep1.waitPageIsLoaded();
        checkoutPageStep1.enterFirstName("Zordan");
        checkoutPageStep1.enterLastName("Power Ranger");
        checkoutPageStep1.enterPostalCode("MD-2004");
        checkoutPageStep1.clickContinueButton();

        CheckoutPageStep2 checkoutPageStep2 = new CheckoutPageStep2(driver);
        checkoutPageStep2.isElementAppear();
        checkoutPageStep2.isFleeceisPresent();
        checkoutPageStep2.isFleeceItemPricePresent();
        checkoutPageStep2.clickFinishButton();

    }


}

