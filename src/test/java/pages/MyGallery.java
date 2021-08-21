package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyGallery extends BaseHelper {

    @FindBy(xpath =  "/html/body/div/div[1]/nav/div/ul[1]/li[2]/a")
    WebElement clickOnMG;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/h2/a")
    WebElement ourImg;

    WebDriver driver;

    public MyGallery(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void clickOnMyGallery()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/h1")));
        clickOnMG.click();
    }

    private void clickOnOurImg()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/h1")));
        ourImg.click();
    }

    public void createMyGallery()
    {
        clickOnMyGallery();
        clickOnOurImg();
    }
}
