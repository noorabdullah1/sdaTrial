package HOMEWORKS.HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait for a maximum of 10 seconds

        // Navigate to the login page
        driver.get("https://id.heroku.com/login");

        // Enter email address
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("noor-babahr@hotmail.com");

        // Enter password
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordField.sendKeys("abdullah-2000");

        // Click on the Login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Log In')]")));
        loginButton.click();

        // Check if "There was a problem with your login" text is visible
        WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'There was a problem with your login')]")));
        if (errorMessage.isDisplayed()) {
            System.out.println("Registration Failed");
        } else {
            System.out.println("Registered");
        }

        // Close all pages
        driver.quit();
    }
}