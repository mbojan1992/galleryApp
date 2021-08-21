package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseHelper {

    @FindBy(xpath = "/html/body/div/div[1]/nav/div/ul[2]/li[3]/a")
    WebElement logout;

    WebDriver driver;

    public Logout(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void clickOnLogout()
    {
        logout.click();
    }

    public void logout()
    {
        clickOnLogout();
    }

}
