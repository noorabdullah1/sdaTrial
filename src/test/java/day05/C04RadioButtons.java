package day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C04RadioButtons {
    /*
    Go to URL:  https://www.facebook.com/
    Click on Create an Account button.
    Then click on the radio buttons.
     */
    @Test
    public void radButtonTest(){
        WebDriver driver= new ChromeDriver();
        //Go to URL:  https://www.facebook.com/
        driver.get("https://www.facebook.com/");

        //Click on Create an Account button.
        driver.findElement(By.xpath("//span[@id='u_b_o_i1']")).click();

        //Then click on the radio buttons.
        //List<WebElement> radButtons=driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']"));
        List<WebElement> radButtons=driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']"));


        radButtons.get(0).click();
        Assert.assertTrue(radButtons.get(0).isSelected());

//        for (WebElement button: radButtons){
//            button.click();
//            Assert.assertTrue(button.isSelected());
//        }


    }
}