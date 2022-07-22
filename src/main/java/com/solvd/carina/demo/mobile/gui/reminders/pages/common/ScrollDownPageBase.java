package com.solvd.carina.demo.mobile.gui.reminders.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.ios.RemindersPage;
import org.openqa.selenium.WebDriver;

public abstract class ScrollDownPageBase extends AbstractPage {
    public ScrollDownPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeText(String text);

    public abstract String getText();

    public abstract RemindersPage clickGoBtn();
}
