package HOMEWORKS.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException{
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
*/

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
    }
}
