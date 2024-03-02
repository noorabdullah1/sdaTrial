package day07;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03AlertsExercise {

static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://demo.automationtesting.in/Alerts.html");
    }
        @Test
        public void test(){
//    Go to URL: http://demo.automationtesting.in/Alerts.html
            driver.findElement(By.partialLinkText("Alert with OK ")).click();
            // //*[@class='btn btn-danger']
            driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
            driver.switchTo().alert().accept();
            driver.findElement(By.partialLinkText(""));
//    Click "Alert with OK" and click 'click the button to display an alert box:'
//    Accept Alert(I am an alert box!) and print alert on console.
//    Click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
//    Cancel Alert  (Press a Button !)
//    Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
//    And then sendKeys «Bootcamp» (Please enter your name)
//    Finally print on console this message "Hello Bootcamp How are you today" assertion these message.

        }
    }

