package HOMEWORKS.HomeWork07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task2 {

//    Go to URL: https://the-internet.herokuapp.com/basic_auth
//    Username: admin
//    Password: admin

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        // Launch the Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to the URL
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    @Test
    public void test(){

            // Provide username and password
            String username = "admin";
            String password = "admin";

            // Build the authentication URL with username and password
            String authUrl = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

            // Navigate to the authentication URL
            driver.get(authUrl);

            // Locate the element containing the congratulations message
        By messageLocator = By.cssSelector("div#content h3");

        // Get the text of the congratulations message
        String actualMessage = driver.findElement(messageLocator).getText();

        // Define the expected congratulations message
        String expectedMessage = "Congratulations! You must have the proper credentials.";
        //Congratulations! You must have the proper credentials.

        // Verify the congratulations message
        //assert actualMessage.equals(expectedMessage) : "Congratulation message is incorrect";
        Assert.assertEquals(expectedMessage,"Congratulation message is incorrect");

        // Print success message if the assertion passes
        System.out.println("Congratulation message is correct");

            // Close the browser
            //driver.quit();
        }
    }

