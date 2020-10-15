package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EBookLoginPage extends AbstractPage {

    @FindBy(css = "input[id='login']")
    static WebElement loginBar;

    @FindBy(css = "input[id='password']")
    static WebElement passwordBar;

    @FindBy(css = "button[id='login-btn']")
    static WebElement loggingBtn;

    public EBookLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);

    }

    public WebDriver loginValidUser(String userName, String password) {
        loginBar.sendKeys(userName);
        passwordBar.sendKeys(password);
        loggingBtn.click();
        return webDriver;
    }

}

//oddzielna klasa wraz z metodami reprezentującymi czynności jakie można wykonywać na stronie
// oraz z polami, reprezentującymi WebElement-y elementy HTML strony

/*    @FindBy(css = "div[class='g']")
    static WebElement webElement;

    public ResultRandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement clickInRandomPage(WebElement googleResults) {
        webElement = googleResults;
        webElement.click();
        return webElement;
    }*/
