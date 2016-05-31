package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SpamPage extends AbstractPage {
    private final String BASE_URL = "https://mail.google.com/mail/u/0/#spam";

    @FindBy(xpath = "//div[contains(text(), 'Not spam')]")
    private WebElement buttonNotSpam;

    public SpamPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        System.out.println("Google Spam page opened");
    }

    public String findLetter(String username, String subjectLetter) {
        WebElement webElement = driver.findElement(By.xpath("//div[contains(text(),'" + subjectLetter + "')]/../div/span[@email='" + username + "']"));
        String email = webElement.getAttribute("email");
        return email;
    }

    public void clickOnLettersFromUser(String username) {
       List<WebElement> list = driver.findElements(By.xpath("//span[@email='" + username + "']/../../..//div[@role='checkbox']"));
        for(WebElement webElement: list) {
            webElement.click();
        }
    }
    public void clickOnNotSpamButton() {
        buttonNotSpam.click();
    }

}