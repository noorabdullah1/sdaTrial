package HOMEWORKS.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*
        // TC - 01
// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.
*/


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
    }
}
