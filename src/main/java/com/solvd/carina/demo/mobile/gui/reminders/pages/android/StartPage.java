package com.solvd.carina.demo.mobile.gui.reminders.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.StartPageSpaceBase;
import com.solvd.carina.demo.mobile.gui.reminders.pages.ios.ScrollDownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = StartPageSpaceBase.class)
public class StartPage extends StartPageSpaceBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@text=\"%s\"]")
    private ExtendedWebElement someMonths;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"%s\"])[1]")
    private ExtendedWebElement someDays ;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ScrollDownPage swipeDown() {
        return null;
    }

    @Override
    public DatePage clickDataPage(String month, String day) {
        if(swipe(someMonths.format(month),Direction.LEFT,10,100)){
            someDays.format(day).click();
        }
        return new DatePage(getDriver());
    }

}
