package course;

import application.EBookHomePage;
import application.EBookLoginPage;
import application.InvalidLoggingPage;
import application.SignUpPage;
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
    public void shouldOpenedPageIsTheCorrectMainPage(){
        Assertions.assertTrue(driver.getTitle().startsWith("app"));
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

    @Test
    void shouldGetErrorWhenFieldsLeavesEmpty() {
        EBookLoginPage eBookLoginPage = new EBookLoginPage(driver);
        EBookHomePage homePage = eBookLoginPage.loginValidUser("", "");
        Assertions.assertEquals("You can't leave fields empty", eBookLoginPage.getError());


    }

    @Test
    void shouldGetErrorWhenWrongPassword() {
        EBookLoginPage eBookLoginPage = new EBookLoginPage(driver);
        EBookHomePage homePage = eBookLoginPage.loginValidUser(".", ".");
        Assertions.assertEquals("Login failed", eBookLoginPage.getError());
    }

    @Test
    void shouldSwitchToSignUpPage() {
        EBookLoginPage eBookLoginPage = new EBookLoginPage(driver);
        SignUpPage signUpPage = eBookLoginPage.switchToRegisterPage();
        EBookHomePage signUpPageName = signUpPage.signingUpPage();
//        Assertions.assertEquals("SIGN UP", signUpPageName);
        System.out.println(signUpPageName.getMessageText());
    }

    @AfterEach
    public void tearDown() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        driver.close();
    }
}