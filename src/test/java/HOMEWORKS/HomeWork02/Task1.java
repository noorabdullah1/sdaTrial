package HOMEWORKS.HomeWork02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    // ================================================TASK1==========================================================
    //Create main method
    public static void main(String[] args) {
        //-------------------------------------------------------------------------
        //Create chrome driver
        WebDriver driver = new ChromeDriver();

        //-------------------------------------------------------------------------
        //Open google home page: https://www.google.com
        driver.get("https://google.com/");
        //-------------------------------------------------------------------------
        //Print Title on page
        String title = driver.getTitle();
        System.out.println("title " + title);
        //-------------------------------------------------------------------------
        //Print Current URL on page
        String url = driver.getCurrentUrl();
        System.out.println("url " + url);
        //-------------------------------------------------------------------------

        //Close/Quit the browser
        driver.close();
        driver.quit();
    }
}