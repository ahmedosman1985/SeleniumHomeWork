package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Ahmed");
        driver.findElement(By.id("customer.lastName")).sendKeys("Osman");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Herndon");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20170");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+19876543");
        driver.findElement(By.id("customer.ssn")).sendKeys("6543210");
        driver.findElement(By.id("customer.username")).sendKeys("ahmed.osman");
        driver.findElement(By.id("customer.password")).sendKeys("password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password");
        driver.findElement(By.className("button")).click();
        driver.quit();



    }
}
