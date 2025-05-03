import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;


public class FirstScenario {
    @Test(description = "First scenarion")
    public void LogicToConnect() throws InterruptedException {

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

        By Select = By.xpath("//div[@class='justify-center px-8 py-4 w-full bg-white hover:bg-custom-gray' and text()='Select']");
        driver.findElement(Select).click();

        By SelectCountry = By.cssSelector("select[title='Select country']");
        driver.findElement(SelectCountry).click();

        By SelectUSA = By.xpath(("//option[text()='USA']"));
        driver.findElement(SelectUSA).click();
        Thread.sleep(1000);
        By SelectID = By.id("SelectLanguage");
        driver.findElement(SelectID).click();
        Thread.sleep(1000);
        By SelectEnglish = By.xpath(("//option[text()='English']"));
        driver.findElement(SelectEnglish).click();
        Thread.sleep(1000);
        By SelectType = By.cssSelector("select[title='Select type']");
        driver.findElement(SelectType).click();
        Thread.sleep(1000);
        By SelectTesting = By.xpath(("//option[text()='Testing']"));
        driver.findElement(SelectTesting).click();
        Thread.sleep(1000);
        By SelectCourses = By.id("AQA Python with index 14");
        driver.findElement(SelectCourses).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[name='SelectPageSearchButton'][type='submit'].h-\\[42px\\].w-\\[180px\\].bg-\\[\\#feda00\\].hover\\:bg-\\[\\#FEC600\\].flex.items-center.justify-center.font-medium.text-sm")).click();

        Thread.sleep(2000);
    }
}
