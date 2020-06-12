package com.softclub.gmail.com.tests.ui;

import com.softclub.gmail.com.base.BaseTest;
import com.softclub.gmail.com.enums.EmailProperty;
import com.softclub.gmail.com.models.User;
import com.softclub.gmail.com.steps.HeaderSteps;
import com.softclub.gmail.com.steps.LoginSteps;
import framework.Logger;
import org.testng.annotations.BeforeMethod;

public class CheckUserIsAbleToLogoutTest extends BaseTest {

    @BeforeMethod
    public void doBeforeTest() {
        Logger.getInstance().info("Fill Login and click 'Next'");
        User user = new User().toBuilder()
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
        logStep("Logout and check Login page presence");
        HeaderSteps.assertHeaderIsOpened();
        HeaderSteps.logout();
        LoginSteps.assertChooseAccountPageIsOpened();
    }
}