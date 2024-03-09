package HOMEWORKS.HomeWork04;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {
    //    task01:
//    Create the driver with BeforeClass and make it static inside the class.
//    Go to http://www.google.com
//    Type "Green Mile" in the search box and print the number of results.
//    Type "Premonition" in the search box and print the number of results.
//    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
//    Close with AfterClass.
//---------------------------------------------------------------------
    By searchBox = By.name("q");
    By results = By.id("result-stats");
    //    Create the driver with BeforeClass and make it static inside the class.
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        // Go to Google homepage
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void greanMileTest() {

        // Type "Green Mile" in the search box and print the number of results
        driver.findElement(searchBox).sendKeys("Green Mile" + Keys.ENTER);
        driver.findElement(searchBox).submit();

        String resultElements = driver.findElement(results).getText();
        System.out.println("Search query: Green Mile");
        System.out.println("Number of results: " + resultElements);
        driver.findElement(searchBox).clear();
    }

// Type "Premonition" in the search box and print the number of results
        @Test
        public void premonitionTest () {
            driver.findElement(searchBox).sendKeys("Premonition" + Keys.ENTER);
            String resultStats2 = driver.findElement(results).getText();
            System.out.println("Search query: Premonition");
            System.out.println("Number of results: " + resultStats2);
            driver.findElement(searchBox).clear();
        }


        // Type "The Curious Case of Benjamin Button" in the search box and print the number of results
        @Test
        public void benjaminButtonTest () {
            driver.findElement(searchBox).sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);
            driver.findElement(searchBox).submit();
            String resultStats3 = driver.findElement(By.id("result-stats")).getText();
            System.out.println("Search query: The Curious Case of Benjamin Button");
            System.out.println("Number of results: " + resultStats3);
            driver.findElement(searchBox).clear();
        }

        //    Close with AfterClass.
        @AfterClass
        public static void tearDown () {
            driver.quit();
        }

    //comment for github



}




