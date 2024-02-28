package HOMEWORKS.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Task6 {
    public static void main(String[] args) {
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
