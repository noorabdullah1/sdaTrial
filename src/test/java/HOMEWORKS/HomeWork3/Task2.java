package HOMEWORKS.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        /*
        // TC - 02
// Go to www.yahoo.com
// Maximize Window
// Go to www.amazon.com
// Maximize Window
// Navigate Back
// Navigate Forward
// Refresh The Page
*/

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
    }
}
