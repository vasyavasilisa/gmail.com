package com.softclub.gmail.com.tests.unit;

import com.softclub.gmail.com.models.Letter;
import com.softclub.gmail.com.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetterTest {
    User firstUser;
    User secondUser;
    User firstSender;
    User secondSender;

    @BeforeMethod
    public void doBeforeMethod() {
        new User("ffirstname", "flastname", "first login", "first pwd");
        new User("ofirstname", "olastname", "second login", "second pwd");
        new User("fsenderfirstname", "fsenderlastname", "first sender login", "first sender pwd");
        new User("osenderfirstname", "osenderlastname", "second sender login", "second sender pwd");
    }

    @Test
    public void testCompareToEqual() {
        Letter firstLetter = new Letter("some subj", "some body", firstUser, firstSender);
        Letter secondLetter = new Letter("some subj", "other body", secondUser, secondSender);
        int result = firstLetter.compareTo(secondLetter);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testCompareToGreaterThan() {
        Letter firstLetter = new Letter("yyyy zz some subj", "some body", firstUser, firstSender);
        Letter secondLetter = new Letter("some subj", "other body", secondUser, secondSender);
        int result = firstLetter.compareTo(secondLetter);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void testCompareToLessThan() {
        Letter firstLetter = new Letter("some subj", "some body", firstUser, firstSender);
        Letter secondLetter = new Letter("wwww subj", "other body", secondUser, secondSender);
        int result = firstLetter.compareTo(secondLetter);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void testCompareToNullObject() {
        Letter firstLetter = new Letter("some subj", "some body", firstUser, firstSender);
        int result = firstLetter.compareTo(null);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void testCompareToNullField() {
        Letter firstLetter = new Letter("some subj", "some body", firstUser, firstSender);
        Letter secondLetter = new Letter(null, "other body", secondUser, secondSender);
        int result = firstLetter.compareTo(secondLetter);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void testNullCompareTo() {
        Letter firstLetter = new Letter(null, "some body", firstUser, firstSender);
        Letter secondLetter = new Letter("some subj", "other body", secondUser, secondSender);
        int result = firstLetter.compareTo(secondLetter);
        Assert.assertTrue(result < 0);
    }
}