package course;

import application.EBookHomePage;
import application.EBookLoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


class LoginPageTest {

    private WebDriver driver;

    @BeforeEach
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://ta-ebookrental-fe.herokuapp.com/login");
    }

    @Test
    void shouldLoginValidUser() {
//        testSetup();
        EBookLoginPage loginPage = new EBookLoginPage(driver);
        EBookHomePage homePage = loginPage.loginValidUser("test", "test");
//        assertThat(homePage.getMessageText(), is("Log in"));
        System.out.println(homePage.getMessageText());
        Assertions.assertEquals("TITLES CATALOG", homePage.getMessageText());
    }

//    @AfterEach
//    public void tearDown() {
//        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
//        driver.close();
//    }
}