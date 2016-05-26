package test.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.res.LoginsPasswords;
import test.steps.Steps;
import test.utils.Utils;

public class SpamGmailTest {
    private Steps steps;

    @BeforeMethod(description = "Init browser")
    public void setUp()
    {
        steps = new Steps();
        steps.initBrowser();
    }

    @Test
    public void oneCanLoginGmail()
    {
        steps.loginGmail(LoginsPasswords.getUSERNAME1(), LoginsPasswords.getPASSWORD1());
        steps.sendEmail(LoginsPasswords.getUSERNAME2()+"@gmail.com","Letter subject from user1 - "+ Utils.getRandomString(3),"Letter  from user1 - "+Utils.getRandomString(20));
        steps.logOut();
        steps.loginGmail(LoginsPasswords.getUSERNAME2(), LoginsPasswords.getPASSWORD2());
    }

    @AfterMethod(description = "Stop Browser")
    public void stopBrowser()
    {
     //   steps.closeDriver();
    }

}