package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SpamPage extends AbstractPage {
    private final String BASE_URL = "https://mail.google.com/mail/u/0/#spam";

    public SpamPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        System.out.println("Google Spam page opened");
    }

    public String findLetter(String username, String subjectLetter, String letterText) {
        WebElement webElement = driver.findElement(By.xpath("//span[@email='" + username + "']"));
        String email = webElement.getAttribute("email");
        return email;
    }
}