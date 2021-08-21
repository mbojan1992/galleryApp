package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MyGallery;
import pages.PositiveLogin;

public class MyGalleryTest extends BaseTest
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

        MyGallery mg = new MyGallery(driver);
        mg.createMyGallery();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div[2]/a/div/img")));
        WebElement titleName = driver.findElement(By.xpath("/html/body/div/div[2]/div/h1"));
        System.out.println("");
        System.out.println("Title name is: " + titleName.getText());
        Assert.assertTrue(titleName.getText().contains("SLIKE"));

        Assert.assertEquals("Wrong description! ", "Ovo su 2 slike", driver.findElement(By.xpath("/html/body/div/div[2]/div/p")).getText());
        System.out.println("");
        System.out.println("Description is:  ---> " + driver.findElement(By.xpath("/html/body/div/div[2]/div/p")).getText());

    }
    }
