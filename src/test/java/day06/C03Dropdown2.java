package day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static day06.C02DropDown01.driver;

public class C03Dropdown2 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
@Test
    public void dropDownTest(){
        // first locate the webElement
        WebElement element = driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]"));

        // Create select object
        Select select = new Select(element); // To use select methods tag name must be "select"

        // use select methods to select option
        select.selectByValue("4");
        select.selectByVisibleText("Purple");

}
}
