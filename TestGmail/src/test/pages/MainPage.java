package test.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends AbstractPage {
    private final String BASE_URL = "https://www.gmail.com/";

    @FindBy(xpath = "//div[@class='z0']")
    private WebElement buttonCreateLetter;

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement areaToWhom;

    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElement areaForSubject;

    @FindBy(xpath = "//td[@class='GQ']//div[@role='textbox']")
    private WebElement areaForLetter;

    @FindBy(xpath = "//tr[@class='n1tfz']//div[@role='button']")
    private WebElement buttonSendLetter;

    @FindBy(xpath = "//a[@class='gb_b gb_8a gb_R']//span")
    private WebElement buttonProfile;

    @FindBy(xpath = "//a[@id='gb_71']")
    private WebElement buttonLogOut;

    @FindBy(xpath = "//div[@title='Report spam']")
    private WebElement buttonSpam;

    @FindBy(xpath = "//span[@role='button']/span[@class='ait']")
    private WebElement buttonLess;

    @FindBy(xpath = " //a[contains(text(),'Spam')]")
    private WebElement buttonShowSpam;





    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        System.out.println("Google Main page opened");
    }

    public void clickOnButtonCreateLetter() {

        buttonCreateLetter.click();
    }

    public void createLetter(String usernameTo, String letterSubject, String letter) {
        areaToWhom.sendKeys(usernameTo);
        areaForSubject.sendKeys(letterSubject);
        areaForLetter.sendKeys(letter);
    }

    public void clickOnButtonSendLetter() {
        buttonSendLetter.click();
    }

    public void clickOnButtonProfile() {
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        buttonProfile.click();
    }

    public void clickOnButtonLogOut() {
        buttonLogOut.click();
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }

    public void clickOnLetterFromUser(String username, String subjectLetter, String letterText) {
        WebElement webElement = driver.findElement(By.xpath("//div[contains(text(),'" + subjectLetter + "')]/../div/span[@email='" + username + "']/../../..//div[@role='checkbox']"));
        webElement.click();
    }

    public void clickOnSpamButton() {
        buttonSpam.click();
    }

    public void clickOnLessButton() {
        buttonLess.click();
    }

    public void clickOnShowSpamButton() {
        buttonShowSpam.click();
    }




    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
