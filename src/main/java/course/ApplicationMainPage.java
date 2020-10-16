package course;

import application.EBookHomePage;
import application.EBookLoginPage;
import application.InvalidLoggingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationMainPage {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://ta-ebookrental-fe.herokuapp.com/login");//wydanie przeglądarce polecenia otwarcia strony o wskazanym adresie
        //   webDriver.navigate().to("https://ta-ebookrental-fe.herokuapp.com/login");

        EBookLoginPage eBookLoginPage = new EBookLoginPage(webDriver);
        EBookHomePage page = eBookLoginPage.loginValidUser("test0", "test0");
//
//        System.out.println(page.getMessageText());

//        System.out.println(webDriver.findElement(By.tagName("h1")).getText());
        InvalidLoggingPage invalidLoggingPage = new InvalidLoggingPage(webDriver);
        System.out.println(invalidLoggingPage.getMessageText());

    }
}
