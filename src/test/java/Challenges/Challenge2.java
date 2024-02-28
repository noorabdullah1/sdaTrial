package Challenges;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;

public class Challenge2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        WebElement add = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        add.click();

        WebElement write = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        write.sendKeys("Challenge"+ Keys.ENTER);

        // //li[normalize-space()='Challenge']//i[@class='fa fa-trash']


        // Step 3: Assert the added todo item
        WebElement todoItem = driver.findElement(By.xpath("//li[normalize-space()='Challenge']"));
        String actualText = todoItem.getText();
        String expectedText = "Challenge";
        Assert.assertEquals("Todo item text does not match", expectedText, actualText);


    }
}
