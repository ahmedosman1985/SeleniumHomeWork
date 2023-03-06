package class04HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
 */
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBoxBtn = driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean isSelectedCheckBox=checkBoxBtn.isSelected();
        if (!isSelectedCheckBox){
            checkBoxBtn.click();
        }
        isSelectedCheckBox=checkBoxBtn.isSelected();
        System.out.println("The Check Box status is "+isSelectedCheckBox);

    }
}
