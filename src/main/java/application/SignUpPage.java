package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends AbstractPage {

    @FindBy(className = "sub-title")
    static WebElement siteName;


    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);
    }

    public EBookHomePage signingUpPage() {
        siteName.getText();
        return new EBookHomePage(webDriver);
    }
}
