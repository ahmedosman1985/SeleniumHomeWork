package class07HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static void main(String[] args) {

        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the website
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));

        driver.findElement(By.xpath("//button[@onclick='setTimeout(display,10000);hidecount();hide();']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']"))).click();

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Button']")));

        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));













    }
}
