package HOMEWORKS.HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    /*
    Go to URL: https://www.linkedin.com/
   Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");

//        WebElement emailAbs = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]"));
//        emailAbs.sendKeys("noor-babahr@hotmail.com");
//        WebElement passAbs = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
//        passAbs.sendKeys("Ar33333");
//        WebElement buttonAbs = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
//        buttonAbs.click();

        WebElement emailRel = driver.findElement(By.xpath("//input[@id='session_key']"));
        emailRel.sendKeys("noor-babahr@hotmail.com");
        WebElement passRel = driver.findElement(By.xpath("//input[@id='session_password']"));
        passRel.sendKeys("Ar33333");
        WebElement buttonRel = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonRel.click();

        driver.quit();



    }
}
