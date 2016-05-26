package test.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.pages.LoginPage;
import test.pages.MainPage;


public class Steps {
    private WebDriver driver;

    public void initBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeDriver() {
        driver.quit();
    }

    public void loginGmail(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(username, password);

    }

    public void sendEmail(String usernameto, String letterSubject, String letter) {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnButtonCreateLetter();
        mainPage.createLetter(usernameto, letterSubject, letter);
        mainPage.clickOnButtonSendLetter();
    }
    public void logOut() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnButtonProfile();
        mainPage.clickOnButtonLogOut();
    }


}

