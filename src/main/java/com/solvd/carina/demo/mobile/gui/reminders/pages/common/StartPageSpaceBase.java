package com.solvd.carina.demo.mobile.gui.reminders.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.DatePage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.ios.ScrollDownPage;
import org.openqa.selenium.WebDriver;

public abstract class StartPageSpaceBase extends AbstractPage {
    public StartPageSpaceBase(WebDriver driver) {
        super(driver);
    }

    public abstract ScrollDownPage swipeDown();

    public abstract DatePage clickDataPage(String month, String day);


}
