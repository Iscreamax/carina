package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomeRemindersPage extends AbstractPage {
    public HomeRemindersPage(WebDriver driver) {
        super(driver);
    }
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"Quick Entry Title Field\"`]")
    private ExtendedWebElement titleField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private ExtendedWebElement notesField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Details\"`]")
    private ExtendedWebElement detailsBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell[`label == \"Test, 1 reminder\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private ExtendedWebElement reminderBtn;
    public void typeTitleText(String text){
        titleField.type(text);
    }

    public void typeNotesText(String text){
        notesField.type(text);
    }

    public DetailsPage clickDetailsBtn(){
        detailsBtn.click();
        return new DetailsPage(getDriver());
    }

    public ListPage clickRemindersBtn(){
        reminderBtn.click();
        return new ListPage(getDriver());
    }

    public ExtendedWebElement getTitleField() {
        return titleField;
    }

    public ExtendedWebElement getNotesField() {
        return notesField;
    }
}
