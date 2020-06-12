package com.softclub.gmail.com.tests.ui;

import com.softclub.gmail.com.base.BaseTest;
import com.softclub.gmail.com.enums.EmailProperty;
import com.softclub.gmail.com.models.Letter;
import com.softclub.gmail.com.models.User;
import com.softclub.gmail.com.pages.forms.HeaderForm;
import com.softclub.gmail.com.steps.*;
import framework.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CheckUserIsAbleToSendLetterToHimselfTest extends BaseTest {
    private User user;

    @BeforeMethod
    public void doBeforeTest() {
        Logger.getInstance().info("Fill Login and click 'Next'");
        user = new User().toBuilder()
                .login(EmailProperty.USERNAME.getValue())
                .password(EmailProperty.SECRET.getValue())
                .build();
        LoginSteps.assertLoginPageIsOpened();
        LoginSteps.fillInLoginAndGoNext(user);

        Logger.getInstance().info("Fill Password and click 'Next'");
        LoginSteps.fillInPasswordAndGoNext(user);
    }

    @Override
    protected void runTest() {
        logStep("Click to write letter");
        LeftHandSteps.clickToWrite();

        logStep("Fill in mandatory fields in dialog");
        Letter letter = new Letter().initData().toBuilder().recipient(user).build();
        DialogSteps.fillInDialogForm(letter);

        logStep("Send letter");
        DialogSteps.clickToSend();

        logStep("Wait for letter to be displayed and check");
        LettersGridSteps.assertLetterAppeared(letter);
        Logger.getInstance().info("Open letter");
        LettersGridSteps.clickOnLetter(letter);
        LetterSteps.assertLetterInfoDisplayedCorrectly(letter);
    }

    @AfterMethod
    public void doAfterTest() {
        if(new HeaderForm().isFormDisplayed()) {
            Logger.getInstance().info("Logout");
            HeaderSteps.logout();
            LoginSteps.waitForChooseAccountPageIsOpened();
        }
    }
}
