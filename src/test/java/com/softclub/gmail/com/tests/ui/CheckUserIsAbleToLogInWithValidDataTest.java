package com.softclub.gmail.com.tests.ui;

import com.softclub.gmail.com.base.BaseTest;
import com.softclub.gmail.com.enums.EmailProperty;
import com.softclub.gmail.com.models.User;
import com.softclub.gmail.com.steps.LettersGridSteps;
import com.softclub.gmail.com.steps.LoginSteps;

public class CheckUserIsAbleToLogInWithValidDataTest extends BaseTest {
    @Override
    protected void runTest() {
        logStep("Fill Login and click 'Next'");
        User user = new User().toBuilder()
                .login(EmailProperty.USERNAME.getValue())
                .password(EmailProperty.SECRET.getValue())
                .build();
        LoginSteps.assertLoginPageIsOpened();
        LoginSteps.fillInLoginAndGoNext(user);

        logStep("Fill Password and click 'Next'");
        LoginSteps.fillInPasswordAndGoNext(user);

        logStep("Wait for authorization is completed and Check main page presence");
        LettersGridSteps.assertInboxesPageIsOpened();
    }
}