package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class create_repository {
    protected WebDriver driver;

    public create_repository(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "repository[name]")
    WebElement name_repository;

    @FindBy(how = How.NAME, using = "repository[visibility]")
    WebElement radioAccessPublic;

    @FindBy(how = How.XPATH, using = "//input[@aria-describedby='about-private-repos']")
    WebElement radioAccessPrivate;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create a new repository')]")
    WebElement btnCreateRepo;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Public')]")
    WebElement accessRepoPublic;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Private')]")
    WebElement accessRepoPrivate;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Quick setup')]")
    WebElement setup;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Repository creation failed.')]")
    WebElement failedRepo;

    public void inputRepo(String nama) {
        name_repository.sendKeys(nama);
    }

    public void checkedAccessPublic() {
        radioAccessPublic.click();
    }

    public void checkedAccessPrivate() {
        radioAccessPrivate.click();
    }

    public void clickBtnCrtRepo() {
        btnCreateRepo.click();
    }

    public void displaySetup() {
        setup.isDisplayed();
    }

    public void displayFailRepo() {
        String nameRepoRequired = failedRepo.getText();
        System.out.println(nameRepoRequired);
        failedRepo.isDisplayed();
        Assert.assertEquals("Repository creation failed.", nameRepoRequired);
    }

    public void getAccessRepoPublic() {
        String acsRepoPublic = accessRepoPublic.getText();
        System.out.println(acsRepoPublic);
        accessRepoPublic.isDisplayed();
        Assert.assertEquals("Public", acsRepoPublic);
    }

    public void getAccessRepoPrivate() {
        String acsRepoPrivate = accessRepoPrivate.getText();
        System.out.println(acsRepoPrivate);
        accessRepoPrivate.isDisplayed();
        Assert.assertEquals("Private", acsRepoPrivate);
    }
}
