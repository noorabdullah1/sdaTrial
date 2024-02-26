package HOMEWORKS;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException{
/*
        // TC - 01
// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/");
        System.out.println("Opened W3Schools");

        driver.navigate().to("https://stackoverflow.com/");
        System.out.println("Opened Stack Overflow");

        driver.navigate().back();
        System.out.println("Went back to W3Schools");

        //Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Went forward to Stack Overflow");

        driver.navigate().refresh();
        System.out.println("Refreshed the page");

        driver.quit();
        System.out.println("Closed the browser");
        */
//-----------------------------------------------------------------------------
 /*
        // TC - 02
// Go to www.yahoo.com
// Maximize Window
// Go to www.amazon.com
// Maximize Window
// Navigate Back
// Navigate Forward
// Refresh The Page
        //System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://de.yahoo.com/?p=us");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title1= driver.getTitle();

        if (title1.contains("yahoo")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        String title2 = driver.getTitle();

        if (title2.contains("amazon")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        */
//-----------------------------------------------------------------------------
/*
        // TC – 03
// Expected Title
// Set Path of the Chrome driver
// Launch Chrome browser
// Open URL of Website
// Maximize Window
// Get Title of current Page
// Validate/Compare Page Title
// Close Browser
        //System.setProperty ("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        String expectedTitle = "CHECK24";
        driver.get("https://check24.de");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String titlePage = driver.getTitle();
        Thread.sleep(5000);
        if (titlePage.contains(expectedTitle)){
        System.out.println("Passed test");
        }
        else{
        System.out.println("Failed test");}
        String pageSource = driver.getPageSource();
        driver.close();
        driver.quit();
        System.out.println( pageSource );
        */
//-----------------------------------------------------------------------------
        /*
        // TC - 04
// Go to the w3school URL : https://www.w3schools.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
// Print the position and size of the page.
        System.out.println("Position = " +
                driver.manage().window().getPosition()); System.out.println("Size = " +
                driver.manage().window().getSize());
//Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(80, 30));
        driver.manage().window().setSize(new Dimension(800, 400));
// Test that the page is in the position and size you want.
        int X = driver.manage().window().getPosition().getX();
        int Y = driver.manage().window().getPosition().getY();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        if (X==80 && Y==80 && width==800 && height==400) {
            System.out.println("PASSED");
        } else {
            System.err.println("FAILED");
        }
//Close the page.
        driver.close();
        */
//-----------------------------------------------------------------------------
/*
// TC - 05
// Invoke Chrome Browser
// Open URL: https: https://www.w3schools.com/
// Maximize the window.
// Print the position and size of the page.
// Minimize the page.
// Wait 7 seconds in the icon state and maximize the page.
// Print the position and dimensions of the page in maximized state.
// Make the page fullscreen.
// Close the Browser.
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/");
driver.manage().window().maximize();
System.out.println("Position="+driver.manage().window().getPosition());
System.out.println("Size= "+driver.manage().window().getSize());
driver.manage().window().minimize();
Thread.sleep(7000);
System.out.println("Size= "+driver.manage().window().getSize());
System.out.println("Position= "+driver.manage().window().getPosition());
driver.manage().window().fullscreen();
driver.quit();
        */
//-----------------------------------------------------------------------------
       // TC - 06

        // Invoke Safari Driver
        WebDriver driver = new SafariDriver();

        // Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        // Maximize the window
        driver.manage().window().maximize();

        // Verify the page title contains the word "video"
        String pageTitle = driver.getTitle();
        boolean containsVideo = pageTitle.toLowerCase().contains("video");
        System.out.println("Page title contains the word 'video': " + containsVideo);

        // Minimize the window
        driver.manage().window().minimize();

        // Verify the page title contains the word "video"
        pageTitle = driver.getTitle();
        containsVideo = pageTitle.toLowerCase().contains("video");
        System.out.println("Page title contains the word 'video': " + containsVideo);

        // Make the page fullscreen
        driver.manage().window().fullscreen();

        // Close the driver
        driver.quit();

    }


    }
