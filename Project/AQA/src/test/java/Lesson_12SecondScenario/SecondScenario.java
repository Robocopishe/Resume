package Lesson_12SecondScenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SecondScenario {
        @Test(description = "Second scenarion")
        public void ToConnect() throws InterruptedException {

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

            By Select = By.xpath("//div[@class='justify-center px-8 py-4 w-full bg-white hover:bg-custom-gray' and text()='Drag & Drop']");
            driver.findElement(Select).click();

            By FirstElement = (By.id("manual1"));
            By FirstTarget = (By.id("target-manual1"));
            WebElement myElement1 = driver.findElement(FirstElement);
            WebElement myElement2 = driver.findElement(FirstTarget);
            actions.dragAndDrop(myElement1,myElement2).perform();

            Thread.sleep(2000);

            By SecondElement = (By.id("manual2"));
            By SecondTarget = (By.id("target-manual2"));
            WebElement myElement3 = driver.findElement(SecondElement);
            WebElement myElement4 = driver.findElement(SecondTarget);
            actions.dragAndDrop(myElement3,myElement4).perform();

            Thread.sleep(2000);

            By ThirdElement = (By.id("auto1"));
            By ThirdTarget = (By.id("target-auto1"));
            WebElement myElement5 = driver.findElement(ThirdElement);
            WebElement myElement6 = driver.findElement(ThirdTarget);
            actions.dragAndDrop(myElement5,myElement6).perform();

            Thread.sleep(2000);

            By FourElement = (By.id("auto2"));
            By FourTarget = (By.id("target-auto2"));
            WebElement myElement7 = driver.findElement(FourElement);
            WebElement myElement8 = driver.findElement(FourTarget);
            actions.dragAndDrop(myElement7,myElement8).perform();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button#DragNDropPageFinishButton.h-\\[42px\\].w-\\[180px\\].bg-\\[\\#feda00\\].hover\\:bg-\\[\\#FEC600\\].self-end.flex.items-center.justify-center.font-medium.text-sm")).click();

        }
}