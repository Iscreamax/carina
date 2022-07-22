package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class ListPage extends AbstractPage {
    public ListPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`value == \"List Name\"`]")
    private ExtendedWebElement titleField;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`value == \"Test\"`]")
    private ExtendedWebElement expectedTitleField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Done\"`]")
    private ExtendedWebElement doneBtn;


    public void typeListTitle(String text) {
        titleField.type(text);
    }

    public RemindersPage clickDoneBtn() {
        doneBtn.click();
        return new RemindersPage(getDriver());
    }

    public ExtendedWebElement getTitleField() {
        return titleField;
    }

    public ExtendedWebElement getExpectedTitleField() {
        return expectedTitleField;
    }
}
