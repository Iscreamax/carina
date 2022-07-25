package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class TimePage extends AbstractPage {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTable[`name == \"ReminderDetail.ID.DetailsTable\"`]")
    private ExtendedWebElement homeBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTable[`name == \"ReminderDetail.ID.DetailsTable\"`]/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private ExtendedWebElement timeField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeKey[`label == \"1\"`]")
    private ExtendedWebElement numberOneBtn;


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeKey[`label == \"2\"`]")
    private ExtendedWebElement numberTwoBtn;


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeKey[`label == \"0\"`]")
    private ExtendedWebElement numberZeroBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTable[`name == \"ReminderDetail.ID.DetailsTable\"`]/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private ExtendedWebElement priorityBtn;

    public TimePage(WebDriver driver) {
        super(driver);
    }

    public void typeTimeField() {
        timeField.click();
        numberOneBtn.doubleClick();
        numberTwoBtn.click();
        numberZeroBtn.click();
        homeBtn.click();
    }

    public PriorityPage clickPriorityBtn() {
        priorityBtn.click();
        return new PriorityPage(getDriver());
    }
}
