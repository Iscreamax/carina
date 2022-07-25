package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class RemindersPage extends AbstractPage {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"New Reminder\"`]")
    private ExtendedWebElement newReminderBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Add List\"`]")
    private ExtendedWebElement newListBtn;

    public RemindersPage(WebDriver driver) {
        super(driver);
    }

    public HomeRemindersPage clickNewRemindersBtn() {
        newReminderBtn.click();
        return new HomeRemindersPage(getDriver());
    }

    public ListPage clickNewListBtn() {
        newListBtn.click();
        ;
        return new ListPage(getDriver());
    }

}
