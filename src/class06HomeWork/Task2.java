package class06HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        /*
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
         */

        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the website
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //navigate to the website
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);
         WebElement contentText=driver.findElement(By.tagName("p"));
         contentText.clear();
         contentText.sendKeys("Hello World");
         driver.switchTo().defaultContent();
         driver.close();




    }
}
