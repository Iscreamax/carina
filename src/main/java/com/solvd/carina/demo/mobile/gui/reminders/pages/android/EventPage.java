package com.solvd.carina.demo.mobile.gui.reminders.pages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EventPage extends AbstractPage {
    @FindBy(id = "com.simplemobiletools.calendar:id/delete")
    private ExtendedWebElement deleteBtn;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement confirmBtn;

    public EventPage(WebDriver driver) {
        super(driver);
    }

    public DatePage clickDeleteBtn() {
        deleteBtn.click();
        confirmBtn.click();
        return new DatePage(getDriver());
    }

}
