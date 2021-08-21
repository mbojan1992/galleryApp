package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PositiveLogin extends BaseHelper {

    @FindBy(xpath = "/html/body/div/div[1]/nav/div/ul[2]/li[1]/a")
    WebElement login;
    @FindBy(id = "email")
    WebElement emailLogin;
    @FindBy(id = "password")
    WebElement passwordLogin;
    @FindBy(className = "btn-custom")
    WebElement submit;

    WebDriver driver;

    public PositiveLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void navigateToGalleryApp()
    {
        driver.get("https://gallery-app.vivifyideas.com/");
    }

    private void login(String email, String password)
    {
        wdWait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/img"), false));
        //js.executeScript("arguments[0].click();", login);
        login.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        emailLogin.sendKeys(email);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        passwordLogin.sendKeys(password);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-custom")));
        submit.click();

    }

    public void validLogin(String email, String password)
    {
        navigateToGalleryApp();
        login(email,password);
    }
}
