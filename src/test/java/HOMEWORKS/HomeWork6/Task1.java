package HOMEWORKS.HomeWork6;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Task1 {
    /*
    Hw:1
Go to URL: https://the-internet.herokuapp.com/dropdown
Select Option 1 using index .
Select Option 2 by value.
Select Option 1 value by visible text.
Print all dropdown value.
Verify the dropdown has Option 2 text.
Print first selected option.
Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
     */
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @AfterClass
    public static void tearDown() {
        //driver.quit();
    }

    @Test
    public void test() {
        // Select Option 1 using index
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);

        // Select Option 2 by value
        select.selectByValue("2");

        // Select Option 1 value by visible text
        select.selectByVisibleText("Option 1");

        // Print all dropdown values
        System.out.println("Dropdown values:");
        for (WebElement option : select.getOptions()) {
            System.out.println(option.getText());
        }

        // Verify the dropdown has Option 2 text
        boolean isOption2Present = false;
        for (WebElement option : select.getOptions()) {
            if (option.getText().equals("Option 2")) {
                isOption2Present = true;
                break;
            }
        }
        Assert.assertTrue("Dropdown does not have Option 2", isOption2Present);

        // Print first selected option
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("First selected option: " + firstSelectedOption.getText());

        // Find the size of the dropdown
        int dropdownSize = select.getOptions().size();
        if (dropdownSize != 3) {
            System.out.println("Expected Is Not Equal Actual");
        }

    }

}