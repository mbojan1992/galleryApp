package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateGallery extends BaseHelper
{
    @FindBy(xpath = "/html/body/div/div[1]/nav/div/ul[1]/li[3]/a")
    WebElement clickOnCG;
    @FindBy(id = "title")
    WebElement enterTermInTF;
    @FindBy(id = "description")
    WebElement addDesc;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/div[3]/div/div/input")
    WebElement imgURL;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/div[3]/button")
    WebElement addImg;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/div[3]/div[2]/div/input")
    WebElement imgURL2;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/button[1]")
    WebElement btnSub;

    WebDriver driver;

    public CreateGallery(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void clickOnCreateGallery()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/nav/div/ul[1]/li[3]/a")));
        clickOnCG.click();
        //js.executeScript("arguments[0].click();", clickOnCG);
    }

    private void enterTermInTitleField(String term)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("title")));
        enterTermInTF.sendKeys(term);
    }

    private void addDescription(String desc)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("description")));
        addDesc.sendKeys(desc);
    }
    private void imageURL(String img)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div/div/input")));
        imgURL.sendKeys(img);
    }

    private void addImage()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/button")));
        addImg.click();
    }

    private void imageURL2(String img2)
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/div/input")));
        imgURL2.sendKeys(img2);
    }

    private void clickOnButtonSubmit()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/form/button[1]")));
        btnSub.click();
    }

    public void createGallery(String term, String desc, String img, String img2)
    {
        clickOnCreateGallery();
        enterTermInTitleField(term);
        addDescription(desc);
        imageURL(img);
        addImage();
        imageURL2(img2);
        clickOnButtonSubmit();
    }
}
