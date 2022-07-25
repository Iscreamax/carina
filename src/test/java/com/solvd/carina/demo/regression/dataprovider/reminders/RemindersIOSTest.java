package com.solvd.carina.demo.regression.dataprovider.reminders;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.ScrollDownPageBase;
import com.solvd.carina.demo.mobile.gui.reminders.pages.common.StartPageSpaceBase;
import com.solvd.carina.demo.mobile.gui.reminders.pages.ios.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RemindersIOSTest extends AbstractTest implements IMobileUtils {
    @Test
    @MethodOwner(owner = "Max")
    public void testReminders() {

        StartPageSpaceBase startPageSpaceBase = new StartPage(getDriver());
        ScrollDownPageBase scrollDownPageBase = startPageSpaceBase.swipeDown();
        final String app = "Reminders";
        final String listName ="Test";
        final String titleName="New Reminders";
        final String noteText="Example";
        scrollDownPageBase.typeText(app);
        Assert.assertEquals(scrollDownPageBase.getText(), app, "Text was not typed");
        RemindersPage reminders = scrollDownPageBase.clickGoBtn();
        ListPage newListPage = reminders.clickNewListBtn();
        SoftAssert softAssert = new SoftAssert();
        newListPage.typeListTitle(listName);
        softAssert.assertEquals(newListPage.getExpectedTitleField().isElementPresent(),"Invalid value of list");
        RemindersPage remindersPage = newListPage.clickDoneBtn();
        HomeRemindersPage newReminders = reminders.clickNewRemindersBtn();
        newReminders.typeTitleText(titleName);
        softAssert.assertEquals(newReminders.getTitleField().getText(),titleName,"Invalid value of Reminder Title");
        newReminders.typeNotesText(noteText);
        softAssert.assertEquals(newReminders.getNotesField().getText(),noteText,"Invalid value of Reminder Notes");
        DetailsPage detailsPage = newReminders.clickDetailsBtn();
        DatePage datePage = detailsPage.clickDateRadioBtn();
        datePage.clickPlanDateBtn();
        TimePage timePage = datePage.clickTimeRadioBtn();
        timePage.typeTimeField();
        PriorityPage priorityPage = timePage.clickPriorityBtn();
        priorityPage.clickMediumBtn();
        detailsPage = priorityPage.clickBackDetailsBtn();
        newReminders = detailsPage.clickAddBtn();
        softAssert.assertAll();

    }
}
