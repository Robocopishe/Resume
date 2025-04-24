package Lesson_11Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UserLoginTest {

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][]{
                {"aqa3af8-student19@mai.ru", "11111111"},
                {"aqa3af8-student20@mai.ru", "11111111"},
                {"aqa3af8-student21@mai.ru", "11111111"}
        };
    }

    @Test (dataProvider = "userData")

     public void SingIn (String email,String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit'].mt-7.h-10.bg-\\[\\#feda00\\].rounded-3xl.w-full")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
