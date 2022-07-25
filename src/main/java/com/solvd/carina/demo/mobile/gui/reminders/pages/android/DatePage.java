package com.solvd.carina.demo.mobile.gui.reminders.pages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DatePage extends AbstractPage {

    @FindBy(id = "com.simplemobiletools.calendar:id/day_fab")
    private ExtendedWebElement addBtn;

    @FindBy(id = "com.simplemobiletools.calendar:id/top_value")
    private ExtendedWebElement title;

    @FindBy(id = "com.simplemobiletools.calendar:id/event_item_holder")
    private ExtendedWebElement eventBtn;

    public DatePage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitlePresent() {
        return title.isElementPresent();
    }

    public boolean isElementPresented() {
        return eventBtn.isElementPresent();
    }

    public NewEvent clickAddBtn() {
        addBtn.click();
        return new NewEvent(getDriver());
    }

    public EventPage clickEventBtn() {
        eventBtn.click();
        return new EventPage(getDriver());
    }

}
