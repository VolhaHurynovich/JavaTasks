package test.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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




    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        System.out.println("Google Main page opened");
    }

    public void clickOnButtonCreateLetter(){

        buttonCreateLetter.click();
    }

    public void createLetter(String usernameTo, String letterSubject, String letter){
        areaToWhom.sendKeys(usernameTo);
        areaForSubject.sendKeys(letterSubject);
        areaForLetter.sendKeys(letter);
    }

    public void clickOnButtonSendLetter(){
        buttonSendLetter.click();
    }
    public void clickOnButtonProfile(){
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        buttonProfile.click();
    }
    public void clickOnButtonLogOut(){
        buttonLogOut.click();
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
