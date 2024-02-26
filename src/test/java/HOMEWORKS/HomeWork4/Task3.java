package HOMEWORKS.HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {


        public static void main(String[] args) {
            WebDriver driver;
            driver = new ChromeDriver();

            // Navigate to the login page
            driver.get("https://id.heroku.com/login");

            // Enter email address
            WebElement emailField = driver.findElement(By.id("email"));
            emailField.sendKeys("your_email@example.com");

            // Enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("your_password");

            // Click on the Login button
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Log In')]"));
            loginButton.click();

            // Check if "There was a problem with your login" text is visible
            WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(), 'There was a problem with your login')]"));
            if (errorMessage.isDisplayed()) {
                System.out.println("Registration Failed");
            } else {
                System.out.println("Registered");
            }

            // Close all pages
            driver.quit();
        }
    }
