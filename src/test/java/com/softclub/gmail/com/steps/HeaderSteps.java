package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.pages.forms.AccountInfoForm;
import com.softclub.gmail.com.pages.forms.HeaderForm;
import org.testng.Assert;

public class HeaderSteps {

    private HeaderSteps() {
    }

    public static void assertHeaderIsOpened() {
        Assert.assertTrue(new HeaderForm().isFormDisplayed(), "Header wasn't opened");
    }

    public static void logout() {
        new HeaderForm().clickAccountImage();
        AccountInfoForm accountInfoForm = new AccountInfoForm();
        accountInfoForm.isFormDisplayed();
        accountInfoForm.clickLogout();
    }
}