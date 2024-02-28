package HOMEWORKS.HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException{
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
*/

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
    }
}
