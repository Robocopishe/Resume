package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementComparator {

    public static void compareWebElements(WebDriver driver, WebElement element1, WebElement element2) {

        int element1Y = element1.getLocation().getY();
        int element2Y = element2.getLocation().getY();

        int element1X = element1.getLocation().getX();
        int element2X = element2.getLocation().getX();


        int element1Area = element1.getSize().getHeight() * element1.getSize().getWidth();
        int element2Area = element2.getSize().getHeight() * element2.getSize().getWidth();

        System.out.println("Comparing WebElements:");


        if (element1Y < element2Y) {
            System.out.println("Element 1 is higher on the page than Element 2.");
        } else if (element2Y < element1Y) {
            System.out.println("Element 2 is higher on the page than Element 1.");
        } else {
            System.out.println("Element 1 and Element 2 are at the same vertical position.");
        }


        if (element1X < element2X) {
            System.out.println("Element 1 is to the left of Element 2.");
        } else if (element2X < element1X) {
            System.out.println("Element 2 is to the left of Element 1.");
        } else {
            System.out.println("Element 1 and Element 2 are at the same horizontal position.");
        }


        if (element1Area > element2Area) {
            System.out.println("Element 1 takes up more space than Element 2.");
        } else if (element2Area > element1Area) {
            System.out.println("Element 2 takes up more space than Element 1.");
        } else {
            System.out.println("Element 1 and Element 2 take up the same amount of space.");
        }
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.automationpractice.pl/index.php");


        WebElement element1 = driver.findElement(By.name("submit_search"));
        WebElement element2 = driver.findElement(By.linkText("Categories"));


        compareWebElements(driver, element1, element2);


        driver.quit();
    }
}
