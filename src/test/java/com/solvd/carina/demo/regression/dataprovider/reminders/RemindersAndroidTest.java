package com.solvd.carina.demo.regression.dataprovider.reminders;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.DatePage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.EventPage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.NewEvent;
import com.solvd.carina.demo.mobile.gui.reminders.pages.android.StartPage;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.StartPageSpaceBase;
import com.solvd.carina.demo.mobile.gui.reminders.pages.ios.ScrollDownPage;
import org.hamcrest.core.StringStartsWith;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RemindersAndroidTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "Max")
    public void RemindersAndroidTest() {
        StartPageSpaceBase startPageSpaceBase = initPage(getDriver(), StartPageSpaceBase.class);
        DatePage datePage = startPageSpaceBase.clickDataPage("September", "3");
        datePage.isTitlePresent();
        NewEvent newEvent = datePage.clickAddBtn();
        newEvent.isTitlePresent();
        final String titleName = "I'll flip ";
        final String descriptionText = "the calendar";
        SoftAssert softAssert = new SoftAssert();
        newEvent.typeEventTitleField(titleName);
        softAssert.assertEquals(newEvent.getTitle(), titleName, "Title was not typed");
        newEvent.typeEventDescriptionField(descriptionText);
        softAssert.assertEquals(newEvent.getDescription(), descriptionText, "Description was not typed");
        datePage = newEvent.clickSaveBtn();
        datePage.isTitlePresent();
        EventPage eventPage = datePage.clickEventBtn();
        datePage= eventPage.clickDeleteBtn();
        softAssert.assertFalse(datePage.isElementPresented());
        softAssert.assertAll();
    }
}
