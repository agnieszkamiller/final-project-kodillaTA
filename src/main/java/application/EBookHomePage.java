package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EBookHomePage extends AbstractPage {

    @FindBy(tagName = "h1")
    static WebElement pageTitle;

    public EBookHomePage(WebDriver webDriver) {
        super(webDriver);
        if (!webDriver.getTitle().equals("app")) {
            throw new IllegalStateException("This is not Home Page of logged in user," +
                    " current page is: " + webDriver.getCurrentUrl());
        }
        PageFactory.initElements(this.webDriver, this);
    }

    public String getMessageText() {
        return pageTitle.getText();
    }

    public EBookHomePage manageProfile() {
        // Page encapsulation to manage profile functionality
        return new EBookHomePage(webDriver);
    }
}
