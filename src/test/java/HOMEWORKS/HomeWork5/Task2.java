package HOMEWORKS.HomeWork5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
         Task 2:
     * breakout task: (in a separate class)
     * navigate to this url https://www.saucedemo.com/v1/inventory.html
     * add the first item you find to your cart
     * open your cart*
     * assert that the item name is correct inside the cart
     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // navigate to this url https://www.saucedemo.com/v1/inventory.html
        driver.get("https://www.saucedemo.com/v1/inventory.html");

        // add the first item you find to your cart
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

       // //*[name()='path' and contains(@fill,'currentCol')]
        driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();

        // Open the cart
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_container"));
        cartIcon.click();

        // Assert that the item name is correct inside the cart
        WebElement cartItemName = driver.findElement(By.className("inventory_item_name"));
        String cartItemNameText = cartItemName.getText();
        Assert.assertEquals("Sauce Labs Backpack", cartItemNameText);

    }
}