package com.solvd.carina.demo.mobile.gui.reminders.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.DatePage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.StartPageSpaceBase;
import org.openqa.selenium.WebDriver;

public class StartPage extends StartPageSpaceBase implements IMobileUtils{
    public StartPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain ="**/XCUIElementTypeIcon[`label == \"Reminders\"`]")
    @ClassChain
    private ExtendedWebElement remindersIcon;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeWindow[2]")
    @ClassChain
    private ExtendedWebElement screenCenter;

    @Override
    public ScrollDownPage swipeDown() {
        swipeDown(300);
        return new ScrollDownPage(getDriver());
    }

    @Override
    public DatePage clickDataPage(String month, String day) {
        return null;
    }


    @Override
    public void swipeDown(int duration) {
        IMobileUtils.super.swipeDown(duration);
    }

}
