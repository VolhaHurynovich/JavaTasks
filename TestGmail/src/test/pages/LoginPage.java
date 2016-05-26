package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
    private final String BASE_URL = "https://www.gmail.com/";

    @FindBy(id = "account-chooser-add-account")
    private WebElement chooserAccount;

    @FindBy(id = "Email")
    private WebElement inputLogin;

    @FindBy(id = "Passwd")
    private WebElement inputPassword;

    @FindBy(id = "next")
    private WebElement nextButton;

    @FindBy(id = "signIn")
    private WebElement signInButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        System.out.println("Google Accounts page opened");
    }

    public void login(String username, String password) {
        if (!(chooserAccount == null)) {
            chooserAccount.click();
        }
        inputLogin.sendKeys(username);
        nextButton.click();
        inputPassword.sendKeys(password);
        signInButton.click();
    }


}