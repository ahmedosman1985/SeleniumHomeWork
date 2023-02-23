package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/%22");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Ahmed");
        driver.findElement(By.name("lastname")).sendKeys("Osman");
        driver.findElement(By.name("reg_email__")).sendKeys("ahmed.osman.va@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ahmed.osman.va@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
        driver.findElement(By.name("websubmit")).click();
        driver.quit();


    }
}