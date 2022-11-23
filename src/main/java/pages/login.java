package pages;

import org.openqa.selenium.By;
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

//    private By email = By.id("login_field");
//    private By pass = By.id("password");
//    private By btnLogin = By.name("commit");
//    private By home = By.xpath("/html/body/div[1]/header/div[7]/details/summary/img");
//    private By home = By.xpath("//h1[contains(text(),'The home for all developers — including you.')]");
//    private By pesanDanger = By.xpath("/html/body/div[3]/main/div/div[2]/div/div/div");

    public void inputEmail(String txtEmail) {
//        driver.findElement(email).sendKeys(txtEmail);
        email.sendKeys(txtEmail);
    }

    public void inputPass(String txtPass) {
//        driver.findElement(pass).sendKeys(txtPass);
        pass.sendKeys(txtPass);
    }

    public void clickBtnLogin() {
//        driver.findElement(btnLogin).click();
        btnLogin.click();
    }

    public void displayHome() {
//        driver.findElement(home).isDisplayed();
        home.isDisplayed();
    }

    public void pesanPeringatan() {
//        driver.findElement(pesanDanger).isDisplayed();
        pesanDanger.isDisplayed();
    }
}
