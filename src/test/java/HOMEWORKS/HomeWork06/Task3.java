package HOMEWORKS.HomeWork06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Task3 {
    /*
    Task:3
Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser.
     */

        private static WebDriver driver;

        @BeforeClass
        public static void setUp() {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/select-menu");
        }

        @AfterClass
        public static void tearDown() {
            driver.quit();
        }

        @Test
        public void testMultiSelect() {
            // Select the Standard Multi-Select using the element id
            WebElement multiSelect = driver.findElement(By.id("cars"));
            Select select = new Select(multiSelect);

            // Verifying that the element is multi-select
            boolean isMultiSelect = select.isMultiple();
            System.out.println("Is multi-select: " + isMultiSelect);

            // Select 'Opel' using the index
            select.selectByIndex(1);

            // Deselect 'Opel' using the index
            select.deselectByIndex(1);

            // Select 'Saab' using value
            select.selectByValue("saab");

            // Deselect 'Saab' using value
            select.deselectByValue("saab");

            // Deselect all the options
            select.deselectAll();
        }

}
