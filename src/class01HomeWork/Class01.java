package class01HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");

        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        String URL=driver.getCurrentUrl();
        System.out.println("The URL of the page is "+URL);
        driver.quit();
    }
}
