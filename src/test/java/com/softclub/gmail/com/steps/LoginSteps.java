package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.models.User;
import com.softclub.gmail.com.pages.ChooseAccountPage;
import com.softclub.gmail.com.pages.LoginContinuePage;
import com.softclub.gmail.com.pages.LoginPage;
import org.testng.Assert;

public class LoginSteps {

    private LoginSteps() {
    }

    public static void assertLoginPageIsOpened() {
        Assert.assertTrue(new LoginPage().isFormDisplayed(), "Login page wasn't opened");
    }

    public static void assertChooseAccountPageIsOpened() {
        Assert.assertTrue(waitForChooseAccountPageIsOpened(), "Choose account page wasn't opened");
    }

    public static boolean waitForChooseAccountPageIsOpened() {
       return new ChooseAccountPage().isFormDisplayed();
    }

    public static void fillInLoginAndGoNext(User user) {
        new LoginPage().fillInLoginAndClickNext(user);
    }

    public static void fillInPasswordAndGoNext(User user) {
        new LoginContinuePage().fillInPasswordAndClickNext(user);
    }
}