package pages;

import org.openqa.selenium.By;

import basePage.BasePage;


public class OurSolution extends BasePage {

    By ourSolutionPageText = By.id("text-142615");

    public OurSolution() {
        super(driver);
    }

    public String verifyOurSolutionURL() {
        return driver.getCurrentUrl();
    }

    public boolean verifyOurSolutionPageTextIsDisplayed() {
        return driver.findElement(ourSolutionPageText).isDisplayed();
    }
}
