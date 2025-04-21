package Lesson_10;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class WindowSwitcher {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        List<String> urls = new ArrayList<>();

        urls.add("http://www.automationpractice.pl/index.php");
        urls.add("https://zoo.waw.pl/");
        urls.add("https://www.w3schools.com/");
        urls.add("https://www.clickspeedtester.com/click-counter/");
        urls.add("https://andersenlab.com/");

        List<String> windowHandles = new ArrayList<>();

        for (int i = 0; i < urls.size();i++) {

            String url = urls.get(i);
            driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB).get(url);
            windowHandles.add(driver.getWindowHandle());

        }
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            System.out.println("Title: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());


            if (driver.getTitle().contains("Zoo")) {
                driver.close();
            }
        }

        if(driver.getWindowHandles().size() > 0){
            driver.switchTo().window(driver.getWindowHandles().iterator().next());
        }

        driver.quit();

    }
}
