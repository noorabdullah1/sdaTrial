package HOMEWORKS.HomeWork08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Task2 extends TestBase {
//    Go to URL: https://the-internet.herokuapp.com/windows
//    Verify the text: “Opening a new window”
//    Verify the title of the page is “The Internet”
//    Click on the “Click Here” button
//    Verify the new window title is “New Window”
//    Go back to the previous window and then verify the title: “The Internet”

@Test
public void test() {
//    Go to URL: https://the-internet.herokuapp.com/windows
    driver.get("https://the-internet.herokuapp.com/windows");
// ------------------------
// Verify the text "Opening a new window"
    assertEquals("Opening a new window",driver.findElement(By.tagName("h3")).getText());
// ------------------------
//    Verify the title of the page is “The Internet”
    assertEquals("The Internet",driver.getTitle());
// ------------------------
//    Click on the “Click Here” button
    driver.findElement(By.partialLinkText("Click")).click();
// ------------------------
//    Verify the new window title is “New Window”
//     //(----????-----)
//    String expectedTitle = "New Window";
//    String actualTitle = driver.getTitle();
//    Assert.assertEquals(actualTitle, expectedTitle);
// ------------------------
//    Go back to the previous window and then verify the title: “The Internet”
            // Store the current window handle
    String currentWindowHandle = driver.getWindowHandle();
    driver.switchTo().window(currentWindowHandle);

    Assert.assertEquals("The Internet", driver.getTitle());
}

}
