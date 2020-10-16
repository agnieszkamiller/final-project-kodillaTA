package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoggingPage extends AbstractPage {

    @FindBy(className = "alert alert--error")
    static WebElement loggingError;

    public InvalidLoggingPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);
    }

    public String getMessageText() {
        return loggingError.getText();
    }
}
