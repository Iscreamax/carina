package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.ScrollDownPageBase;
import org.openqa.selenium.WebDriver;

public class ScrollDownPage extends ScrollDownPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"SpotlightSearchField\"`]")
    private ExtendedWebElement searchField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"go\"`]")
    private ExtendedWebElement goBtn;

    public ScrollDownPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeText(String text) {
        searchField.type(text);
    }

    @Override
    public String getText() {
        return searchField.getText();
    }


    @Override
    public RemindersPage clickGoBtn() {
        goBtn.click();
        return new RemindersPage(getDriver());
    }


}
