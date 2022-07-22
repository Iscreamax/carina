package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class DetailsPage extends AbstractPage {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSwitch[`label == \"Date\"`]")
    private ExtendedWebElement dateRadioBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Add\"`]")
    private ExtendedWebElement addBtn;
    public DetailsPage(WebDriver driver) {
        super(driver);
    }


    public DatePage clickDateRadioBtn(){
        dateRadioBtn.click();
        return new DatePage(getDriver());
    }
    public HomeRemindersPage clickAddBtn(){
        addBtn.click();
        return new HomeRemindersPage(getDriver());
    }

}
