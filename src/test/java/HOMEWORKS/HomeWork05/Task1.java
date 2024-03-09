package HOMEWORKS.HomeWork05;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Task1 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/radio-button");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void testRadioButtonSelection() {
        List<WebElement> radioButtons = driver.findElements(By.name("like"));

        for (int i = 0; i < radioButtons.size(); i++) {
            WebElement radioButton = radioButtons.get(i);
            if (!radioButton.isSelected()) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click()", radioButton);
                System.out.println("Radio button " + (i + 1) + " is selected...");
            } else {
                System.out.println("Radio button " + (i + 1) + " is already selected...");
            }
        }

        for (WebElement radioButton : radioButtons) {
            Assert.assertTrue(radioButton.isSelected());
        }
    }
}