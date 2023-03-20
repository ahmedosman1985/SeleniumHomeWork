package class08HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath
         */

        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //maximize the website
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i <columnID.size() ; i++) {
            String text = columnID.get(i).getText();
            if (text.equalsIgnoreCase("52387A")){
                System.out.println(text);
                System.out.println("The printed id is located in row number "+i);

                WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i)+"]/td[1]"));
                checkbox.click();
            }

        }

    }
}
