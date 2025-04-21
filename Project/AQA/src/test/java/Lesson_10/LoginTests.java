package Lesson_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String loginUrl = "https://qa-course-01.andersenlab.com/login";

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(loginUrl);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Successful Login with Valid Credentials")
    void testSuccessfulLogin() {
        enterCredentials("aqa3af8-student19@mai.ru", "11111111");
        clickLoginButton();
        assertLoginSuccess();
    }

    @Test
    @DisplayName("Login with Invalid Username")
    void testLoginWithInvalidUsername() {
        enterCredentials("invalidUser", "11111111");
        clickLoginButton();
        assertLoginFailure("Invalid email address");
    }

    @Test
    @DisplayName("Login with Invalid Password")
    void testLoginWithInvalidPassword() {
        enterCredentials("aqa3af8-student19@mai.ru", "invalidPassword");
        clickLoginButton();
        assertLoginFailure("Invalid  password");
    }

    @Test
    @DisplayName("Login with Empty Username")
    void testLoginWithEmptyUsername() {
        enterCredentials("", "testUser123");
        clickLoginButton();
        assertLoginFailure("Required");
    }

    @Test
    @DisplayName("Login with Empty Password")
    void testLoginWithEmptyPassword() {
        enterCredentials("testUser", "");
        clickLoginButton();
        assertLoginFailure("Required");
    }

    @Test
    @DisplayName("Login with Empty Username and Password")
    void testLoginWithEmptyUsernameAndPassword() {
        enterCredentials("", "");
        clickLoginButton();
        assertLoginFailure("Required");
    }

    // Helper Methods
    private void enterCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    private void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit'].mt-7.h-10.bg-\\[\\#feda00\\].rounded-3xl.w-full"));
        loginButton.click();
    }

    private void assertLoginSuccess() {
        try {
            WebElement profileElement = wait.until(ExpectedConditions.presenceOfElementLocated((By.linkText("Name"))));
            Assertions.assertTrue(profileElement.isDisplayed(), "Login should be successful.");
        } catch (Exception e) {
            Assertions.fail("Login failed: " + e.getMessage());
        }
    }

    private void assertLoginFailure(String expectedErrorMessage) {
        try {
            WebElement errorMessageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("error-message")));
            Assertions.assertEquals(expectedErrorMessage, errorMessageElement.getText(), "Error message should match.");
        } catch (Exception e) {
            Assertions.fail("Login should fail with an error message: " + e.getMessage());

        }
    }
}
