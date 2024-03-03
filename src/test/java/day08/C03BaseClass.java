package day08;

import org.junit.Test;
import utilities.TestBase;

import static day08.C01IFrames01.driver;

public class C03BaseClass extends TestBase {

    @Test
    public void test(){
        driver.get("https://google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://clarusway.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void test3(){
        driver.get("https://amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}