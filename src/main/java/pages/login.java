package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {
    protected WebDriver driver;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "login_field")
    WebElement email;

    @FindBy(how = How.ID, using = "password")
    WebElement pass;

    @FindBy(how = How.NAME, using = "commit")
    WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'The home for all developers — including you.')]")
    WebElement home;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/main/div/div[2]/div/div/div")
    WebElement pesanDanger;

    public void inputEmail(String txtEmail) {
        email.sendKeys(txtEmail);
    }

    public void inputPass(String txtPass) {
        pass.sendKeys(txtPass);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void displayHome() {
        home.isDisplayed();
    }

    public void pesanPeringatan() {
        pesanDanger.isDisplayed();
    }
}
