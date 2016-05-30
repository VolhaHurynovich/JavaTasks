package test.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.pages.LoginPage;
import test.pages.MainPage;
import test.pages.SpamPage;


public class Steps {
    private WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    SpamPage spamPage;

    public void initBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        spamPage = new SpamPage(driver);

    }

    public void closeDriver() {
        driver.quit();
    }

    public void loginGmail(String username, String password) {
        loginPage.openPage();
        loginPage.login(username, password);

    }

    public void sendEmail(String usernameto, String letterSubject, String letter) {
        mainPage.openPage();
        mainPage.clickOnButtonCreateLetter();
        mainPage.createLetter(usernameto, letterSubject, letter);
        mainPage.clickOnButtonSendLetter();
    }

    public void logOut() {
        mainPage.openPage();
        mainPage.clickOnButtonProfile();
        mainPage.clickOnButtonLogOut();
    }

    public void markLetterAsSpam(String username, String subjectLetter, String letterText) {
        mainPage.openPage();
        mainPage.clickOnLetterFromUser(username,subjectLetter,letterText);
        mainPage.clickOnSpamButton();
    }

    public void showSpam() {
        mainPage.openPage();
        mainPage.clickOnLessButton();
        mainPage.clickOnShowSpamButton();

    }

    public String findLetterOnPage(String username, String subjectLetter, String letterText) {
        spamPage.openPage();
        return  spamPage.findLetter(username, subjectLetter, letterText);
    }

}

