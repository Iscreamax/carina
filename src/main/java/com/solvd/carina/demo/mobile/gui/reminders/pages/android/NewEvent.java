package com.solvd.carina.demo.mobile.gui.reminders.pages.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewEvent extends AbstractPage {

    @FindBy(id = "com.simplemobiletools.calendar:id/event_holder")
    private ExtendedWebElement newEventTitle;

    @FindBy(id = "com.simplemobiletools.calendar:id/event_title")
    private ExtendedWebElement eventTitleField;

    @FindBy(id = "com.simplemobiletools.calendar:id/event_description")
    private ExtendedWebElement eventDescriptionField;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Save\"]")
    private ExtendedWebElement saveBtn;

    public NewEvent(WebDriver driver) {
        super(driver);
    }

    @Override
    public PageOpeningStrategy getPageOpeningStrategy() {
        return super.getPageOpeningStrategy();
    }

    public boolean isTitlePresent() {
        return newEventTitle.isElementPresent();
    }

    public void typeEventTitleField(String text) {
        eventTitleField.type(text);
    }

    public void typeEventDescriptionField(String text) {
        eventDescriptionField.type(text);
    }

    public ExtendedWebElement getEventTitleField() {
        return eventTitleField;
    }

    public ExtendedWebElement getEventDescriptionField() {
        return eventDescriptionField;
    }

    public String getTitle() {
        return eventTitleField.getText();
    }

    public String getDescription() {
        return eventDescriptionField.getText();
    }

    public DatePage clickSaveBtn() {
        saveBtn.click();
        return new DatePage(getDriver());
    }
}
