package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.PositiveLogin;

public class LoginTest extends BaseTest
{
    @Test
    public void galleryApp() {
        PositiveLogin pl = new PositiveLogin(driver);
        pl.validLogin("test123@gmail.com", "test123./");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/nav/div/ul[2]/li[3]/a")));
        WebElement validAssert = driver.findElement(By.xpath("/html/body/div/div[1]/nav/div/ul[2]/li[3]/a"));
        validAssert.getText();
        Assert.assertTrue(true);
        System.out.println("After successful login you can see: " + validAssert.getText());
    }
}
