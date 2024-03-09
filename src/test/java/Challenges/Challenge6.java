package Challenges;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Challenge6 extends TestBase {
    @Test
    public void test() {
        driver.get("https://www.youtube.com/");

        WebElement inputFild =driver.findElement(By.xpath("//input[@id='search']"));
        inputFild.sendKeys("interstellar");

        driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();

        WebElement firstVideo = driver.findElement(By.cssSelector("a#video-title"));
        firstVideo.click();

        // Assert that the video is opened
        boolean isVideoDisplayed = firstVideo.isDisplayed();
        Assert.assertTrue("The video is not playing.", isVideoDisplayed);

        // Assert that the video is from Hans Zimmer
        WebElement videoUploader = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-watch-metadata'][contains(text(),'Interstellar Main Theme - Extra Extended - Soundtr')]"));
        Assert.assertTrue(videoUploader.getText().contains("Soundtrack"));







    }
}
