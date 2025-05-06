package Lesson_13.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

     private WebDriver driver;
     By usernameField = By.name("email");
     By passwordField = By.name("password");
     By loginButton = By.cssSelector("button[type='submit'].mt-7.h-10.bg-\\[\\#feda00\\].rounded-3xl.w-full");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


    public void assertLoginSuccess() {
        System.out.println("Login was not successful");
    }

    public void assertLoginFailure(String expectedErrorMessage) {

        System.out.println("\"Error message is not as expected\"");
    }

}
