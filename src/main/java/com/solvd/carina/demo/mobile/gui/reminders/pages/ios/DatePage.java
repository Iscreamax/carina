package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class DatePage extends AbstractPage {
    public DatePage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"30\"`]")
    private ExtendedWebElement planDateBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSwitch[`label == \"Time\"`]")
    private ExtendedWebElement timeRadioBtn;

    public void clickPlanDateBtn(){
        planDateBtn.click();
    }

    public TimePage clickTimeRadioBtn(){
        timeRadioBtn.click();
        return new TimePage(getDriver());
    }
}
