package Lesson_12ThridScenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ThridScenario {
    @Test(description = "Third scenarion")
    public void Connect() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        driver.findElement(By.name("email")).sendKeys("aqa3af8-student19@mai.ru");
        driver.findElement(By.name("password")).sendKeys(("11111111"));
        driver.findElement((By.cssSelector("button[type='submit'].mt-7.h-10.bg-\\[\\#feda00\\].rounded-3xl.w-full"))).click();

        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        By aqaPracticeLocator = By.xpath("//div[@class='my-auto' and text()='AQA Practice']");
        actions.moveToElement(driver.findElement(aqaPracticeLocator)).perform();
        Thread.sleep(2000);

        By Select = By.xpath("//div[@class='justify-center px-8 py-4 w-full bg-white hover:bg-custom-gray' and text()='Actions, Alerts & Iframes']");
        driver.findElement(Select).click();

        driver.findElement((By.xpath("//button[@id='AlertButton' and contains(@class, 'w-[176px]') and contains(@class, 'px-[15px]') and contains(@class, 'py-[7px]') and contains(@class, 'bg-sky-100')]"))).click();
        Alert alert = null;
        alert.accept();

        By button =((By.xpath("//button[text()='Get Discount']")));
        WebElement doubleClickButton = driver.findElement(button);
        actions.doubleClick(doubleClickButton).perform();
        alert.accept();


        By click = By.xpath("//button[@data-test-id='PromptButton']");
        WebElement rightClickElementLocator = driver.findElement(click);
        actions.contextClick(rightClickElementLocator).perform();
        alert.accept();

    }
}