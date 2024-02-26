package day01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BeforeClassAfterClassAnnotation {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = new ChromeDriver();
        System.out.println("Before class method is executed...");
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
        System.out.println("After class method is executed...");
    }

    @Test
    public void test1() {
        driver.get("https://google.com");
        System.out.println("Test1 is executed...");
    }

    @Test
    public void test2() {
        driver.get("https://clarusway.com");
        System.out.println("Test2 is executed...");
    }
}