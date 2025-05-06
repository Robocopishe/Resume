package Lesson_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Lesson_13.page.LoginPage;

public class LoginTest {

    private static WebDriver driver;
    private static LoginPage loginPage;
    private static String loginUrl = "https://qa-course-01.andersenlab.com/login";

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(loginUrl);
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void close() {
          driver.quit();
    }

    @Test
    @DisplayName("Successful Login with Valid Credentials")
    void testSuccessfulLogin() {
        loginPage.enterCredentials("aqa3af8-student19@mai.ru", "11111111");
        loginPage.clickLoginButton();
        loginPage.assertLoginSuccess();
    }

    @Test
    @DisplayName("Login with Invalid Username")
    void testLoginWithInvalidUsername() {
        loginPage.enterCredentials("invalidUser", "11111111");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Invalid email address");
    }

    @Test
    @DisplayName("Login with Invalid Password")
    void testLoginWithInvalidPassword() {
        loginPage.enterCredentials("aqa3af8-student19@mai.ru", "invalidPassword");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Invalid  password");
    }

    @Test
    @DisplayName("Login with Empty Username")
    void testLoginWithEmptyUsername() {
        loginPage.enterCredentials("", "testUser123");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Required");
    }

    @Test
    @DisplayName("Login with Empty Password")
    void testLoginWithEmptyPassword() {
        loginPage.enterCredentials("testUser", "");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Required");
    }

    @Test
    @DisplayName("Login with Empty Username and Password")
    void testLoginWithEmptyUsernameAndPassword() {
        loginPage.enterCredentials("", "");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Required");
    }

    @Test
    @DisplayName("Login with Trailing Spaces in Username")
    void testLoginWithTrailingSpacesInUsername() {
        loginPage.enterCredentials("aqa3af8-student19@mai.ru   ", "11111111");
        loginPage.clickLoginButton();
        System.out.println("Testing with trailing spaces in username requires investigation of app behavior");
    }

    @Test
    @DisplayName("Login with Trailing Spaces in Password")
    void testLoginWithTrailingSpacesInPassword() {
        loginPage.enterCredentials("aqa3af8-student19@mai.ru", "11111111   ");
        loginPage.clickLoginButton();
        System.out.println("Testing with trailing spaces in password requires investigation of app behavior");
    }

    @Test
    @DisplayName("Login with Username Containing Special Characters")
    void testLoginWithUsernameContainingSpecialCharacters() {
        loginPage.enterCredentials("!@#$%^&*()", "11111111");
        loginPage.clickLoginButton();
        loginPage.assertLoginFailure("Invalid email address");
    }

    @Test
    @DisplayName("Login with Very Long Password")
    void testLoginWithVeryLongPassword() {
        String longPassword = "a".repeat(256);
        loginPage.enterCredentials("aqa3af8-student19@mai.ru", longPassword);
        loginPage.clickLoginButton();
        System.out.println("Testing with a very long password requires investigation of app behavior");
    }
}