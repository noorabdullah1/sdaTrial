package HOMEWORKS.HomeWork09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Task1 extends TestBase {
//    Go to URL: http://demo.guru99.com/test/drag_drop.html
//    Drag and drop the BANK button to the Account section in DEBIT SIDE
//    Drag and drop the SALES button to the Account section in CREDIT SIDE
//    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
//    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
//    Verify the visibility of Perfect text.
    @Test
    public void test(){

//    Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get("http://demo.guru99.com/test/drag_drop.html");

//    Drag and drop the BANK button to the Account section in DEBIT SIDE
        //a[normalize-space()='BANK']
        WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement bankTo = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

        actions.dragAndDrop(bank,bankTo).build().perform();

//    Drag and drop the SALES button to the Account section in CREDIT SIDE
        WebElement sale = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
        WebElement saleTo = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));

        actions.dragAndDrop(sale,saleTo).build().perform();
//    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        WebElement depit = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
        WebElement depitTo = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));

        actions.dragAndDrop(depit,depitTo).build().perform();
//    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        WebElement credit = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
        WebElement depicreditTo = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));

        actions.dragAndDrop(credit,depicreditTo).build().perform();

// Verify the visibility of the "Perfect" text
        WebElement perfectText = driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
        boolean isPerfectTextVisible = perfectText.isDisplayed();
        Assert.assertTrue("The 'Perfect' text is not visible", isPerfectTextVisible);


    }
}
