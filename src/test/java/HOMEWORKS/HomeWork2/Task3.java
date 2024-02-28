package HOMEWORKS.HomeWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
// ===============================================================================================================
// ================================================TASK3==========================================================
// ===============================================================================================================
        WebDriver driver = new ChromeDriver();

        //Invoke Chrome Driver
        driver.get("https://google.com/");
        //-------------------------------------------------------------------------
        //Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.navigate().to("https://www.facebook.com/");
        //-------------------------------------------------------------------------
        //Verify expected URL equals to the actual URL.
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("URL verification passed!");
        } else {
            System.out.println("URL verification failed!");
        }
        //-------------------------------------------------------------------------
        //Verify  pagesource of FaceBook contains "Facebook" .
        String pageSource = driver.getPageSource();

        if (pageSource.contains("Facebook")) {
            System.out.println("Page source verification passed!");
        } else {
            System.out.println("Page source verification failed!");
        }

    } }
