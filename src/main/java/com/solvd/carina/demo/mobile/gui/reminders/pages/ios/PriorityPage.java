package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class PriorityPage extends AbstractPage {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Medium\"`]")
    private ExtendedWebElement mediumBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Details\"`]")
    private ExtendedWebElement backDetailsBtn;

    public PriorityPage(WebDriver driver) {
        super(driver);
    }

    public void clickMediumBtn() {
        mediumBtn.click();
    }

    public DetailsPage clickBackDetailsBtn() {
        backDetailsBtn.click();
        return new DetailsPage(getDriver());
    }
}
