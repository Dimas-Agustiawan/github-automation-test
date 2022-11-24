package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logout {
    WebDriver driver;

    public logout(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//header/div[7]/details[1]/summary[1]/img[1]")
    WebElement img;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign out')]")
    WebElement logout;

    public void clickImg() {
        img.click();
    }

    public void clickLogout() {
        logout.click();
    }
}
