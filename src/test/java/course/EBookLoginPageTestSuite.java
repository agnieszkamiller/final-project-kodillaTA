package course;

import application.EBookHomePage;
import application.EBookLoginPage;
import application.InvalidLoggingPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


class EBookLoginPageTestSuite {

    private WebDriver driver;
    //alert__content

    @BeforeEach
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://ta-ebookrental-fe.herokuapp.com/login");
    }

    @Test
    void shouldLoginValidUser() {
        application.EBookLoginPage loginPage = new application.EBookLoginPage(driver);
        EBookHomePage homePage = loginPage.loginValidUser("test", "test");
        Assertions.assertEquals("eBook .app", homePage.getMessageText());
    }

    @Test
    void shouldLoginInvalidUser() {
        application.EBookLoginPage loginPage = new application.EBookLoginPage(driver);
        EBookHomePage homePage = loginPage.loginValidUser("test0", "test0");
        InvalidLoggingPage loggingPage = new InvalidLoggingPage(driver);

        System.out.println(loggingPage.getMessageText());
//        Assertions.assertEquals("eBook .app", homePage.getMessageText());
    }

    @AfterEach
    public void tearDown() {
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        driver.close();
    }
}