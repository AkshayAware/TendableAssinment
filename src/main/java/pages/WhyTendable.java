package pages;

import org.openqa.selenium.By;

import basePage.BasePage;


public class WhyTendable extends BasePage {

    By whyTendablePageText = By.id("text-141614");

    public WhyTendable() {
        super(driver);
    }

    public String verifyWhyTendableURL() {
        return driver.getCurrentUrl();
    }

    public boolean verifyWhyTendablePageTextIsDisplayed() {
        return driver.findElement(whyTendablePageText).isDisplayed();
    }

}
