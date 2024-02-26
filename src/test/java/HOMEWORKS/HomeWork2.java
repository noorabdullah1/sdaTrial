package HOMEWORKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    // ================================================TASK1==========================================================
        //Create main method
    public static void main(String[] args) {
    //-------------------------------------------------------------------------
        //Create chrome driver
        WebDriver driver = new ChromeDriver();
        /*
    //-------------------------------------------------------------------------
        //Open google home page: https://www.google.com
        driver.get("https://google.com/");
    //-------------------------------------------------------------------------
        //Print Title on page
        String title = driver.getTitle();
        System.out.println("title "+ title);
    //-------------------------------------------------------------------------
        //Print Current URL on page
        String url = driver.getCurrentUrl();
        System.out.println("url "+ url);
   //-------------------------------------------------------------------------

        //Close/Quit the browser
        driver.close();
        driver.quit();
   */
// ===============================================================================================================
// ================================================TASK3==========================================================
// ===============================================================================================================
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
    }
}
