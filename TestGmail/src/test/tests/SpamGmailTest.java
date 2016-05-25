package test.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.res.LoginsPasswords;
import test.steps.Steps;

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

    }

    @AfterMethod(description = "Stop Browser")
    public void stopBrowser()
    {
        steps.closeDriver();
    }

}