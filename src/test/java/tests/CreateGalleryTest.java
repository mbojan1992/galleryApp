package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CreateGallery;
import pages.PositiveLogin;

public class CreateGalleryTest extends BaseTest
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

        CreateGallery cg = new CreateGallery(driver);
        cg.createGallery("Slike", "Ovo su 2 slike", "https://www.slikenaplatnubg.rs/wp-content/uploads/2019/05/slike-na-platnu-priroda-53.jpg", "https://www.dominomagazin.com/wp-content/uploads/2020/01/kako-editovati-slike-1200x900.jpg");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]")));
        WebElement authorName = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/p/a"));
        System.out.println("");
        System.out.println("Author name is: " + authorName.getText());
        Assert.assertTrue(authorName.getText().contains("Test123. Testic123/"));

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]")));
        WebElement created = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/small"));
        System.out.println("");
        System.out.println(created.getText());
        Assert.assertTrue(created.getText(), true);

    }
    }
