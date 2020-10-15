package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EBookHomePage extends AbstractPage {

    //  private By messageBy = By.className("sub-title flex-grow--1 margin-right--1");
    @FindBy(className = "titles page")
    static WebElement pageTitle;

    public EBookHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);

//        if (!webDriver.getTitle().equals("TITLES CATALOG")) {
//            throw new IllegalStateException("This is not Home Page of logged in user," +
//                    " current page is: " + webDriver.getCurrentUrl());
//        }
    }


    public String getMessageText() {
        return pageTitle.getText();
    }


    public EBookHomePage manageProfile() {
        // Page encapsulation to manage profile functionality
        return new EBookHomePage(webDriver);
    }
}
