package HOMEWORKS.HomeWork04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    /* Task 4:
    Navigate to https://testpages.herokuapp.com/styled/index.html
    Click on Simple Calculator under Micro Apps.
    Type any number in the first input.
    Type any number in the second input.
    Click on Calculate.
    Get the result.
    Print the result.*/


        public static void main(String[] args) {

            WebDriver driver;
            driver = new ChromeDriver();

            //Navigate to https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");


            // Click on the "Simple Calculator" link
            WebElement simpleCalculatorLink = driver.findElement(By.xpath("//a[@id='calculatetest']"));
            simpleCalculatorLink.click();

            //Type any number in the first input
            WebElement firstInput = driver.findElement(By.id("number1"));
            firstInput.sendKeys("10");


            //Type any number in the second input.
            WebElement secondInput = driver.findElement(By.id("number2"));
            secondInput.sendKeys("5");

            // Click on Calculate.
            WebElement calculateButton = driver.findElement(By.id("calculate"));
            calculateButton.click();

            // Get the result
            WebElement result = driver.findElement(By.id("answer"));

            // Print the result
            System.out.println("Result: " + result.getText());

            // Close the browser
            driver.quit();
        }

}
