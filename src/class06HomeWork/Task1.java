package class06HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
/*
HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page

 */
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the website
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //navigate to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.tagName("button")).click();
        WebElement text=driver.findElement(By.tagName("h4"));
        if (text.isDisplayed()){
            System.out.println("Text is Displayed");
        }else {
            System.out.println("Text doesn't exist");
        }
        driver.close();
    }
}
