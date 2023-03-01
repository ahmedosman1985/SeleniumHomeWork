package class03HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement enterMessage =driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("I'm testing the website myself");

        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("150");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("100");
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
        WebElement getTotaltxt=driver.findElement(By.xpath("//button[text()='Get Total']"));
            String buttonText= getTotaltxt.getText();
        System.out.println(buttonText);
        driver.quit();
    }


}
