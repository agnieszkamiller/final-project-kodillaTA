package course;

import application.EBookHomePage;
import application.EBookLoginPage;
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

//        EBookLoginPage eBookLoginPage = new EBookLoginPage(webDriver);
//        WebDriver page = eBookLoginPage.loginValidUser("test", "test");
//
//        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        WebElement messageElement = wait.until(
//                ExpectedConditions.visibilityOf(page.findElement(By.className("title text--center")))
//        );

//        WebElement message = page.findElement(By.className("sub-title flex-grow--1 margin-right--1"));
//        System.out.println(messageElement.getText());
        System.out.println("asdasdasdaddad");
        WebElement webElement = webDriver.findElement(By.className("title text--center"));
        WebDriverWait some_element = new WebDriverWait(webDriver,10);
        some_element.until(ExpectedConditions.presenceOfElementLocated(By.className("title text--center")));
        System.out.println(some_element);
        System.out.println(webElement.getText());


        //     System.out.println(page.getMessageText());


        //        HomePage homePage = new HomePage(webDriver);

        //       LoginPage loginPage = new LoginPage(webDriver);
        //      loginPage.loginValidUser("test","test");

//        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
//        Select yearSelect = new Select(yearCombo);
//        yearSelect.selectByIndex(5);

/*
        WebElement inputField = webDriver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");
        inputField.submit();*/


        //WebDriverWait wait = new WebDriverWait(driver, 20);
        // wait.until(ExpectedConditions.visibilityOfAllElements(By.className("my_Class")));
    }
}
