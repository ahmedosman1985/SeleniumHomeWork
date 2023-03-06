package class04HomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
 */
public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List <WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[value ^= 'Option']"));
        for (WebElement checkBox :optionCheckBoxes
             ) {
            String checkBoxes=checkBox.getAttribute("value");
            if (checkBoxes.equalsIgnoreCase("Option-3")){
            checkBox.click();
        }
        }
            Thread.sleep(3000);
            driver.close();
}}
