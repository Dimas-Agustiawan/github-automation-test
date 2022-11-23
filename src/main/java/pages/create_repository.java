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

//    private By name_repository = By.name("repository[name]");
//    private By radioAccessPublic = By.name("repository[visibility]");
//    private By radioAccessPrivate = By.xpath("//input[@aria-describedby='about-private-repos']");
//    private By btnCreateRepo = By.xpath("/html/body/div[5]/div/div/div/div/div/main/div[1]/article[1]/div/div[1]/section/form/button");
//    private By btnCreateRepo = By.xpath("//button[contains(text(),'Create a new repository')]");
//    private By accessRepoPublic = By.xpath("//span[contains(text(),'Public')]");
//    private By accessRepoPrivate = By.xpath("//span[contains(text(),'Private')]");
//    private By setup = By.xpath("/html/body/div[5]/div/main/turbo-frame/div/div/git-clone-help/div[1]/h3");
//    private By setup = By.xpath("//strong[contains(text(),'Quick setup')]");
//    private By failedRepo = By.xpath("//div[contains(text(),'Repository creation failed.')]");

    public void inputRepo(String nama) {
//        driver.findElement(name_repository).sendKeys(nama);
        name_repository.sendKeys(nama);
    }

    public void checkedAccessPublic() {
//        driver.findElement(radioAccessPublic).click();
        radioAccessPublic.click();
    }

    public void checkedAccessPrivate() {
//        driver.findElement(radioAccessPrivate).click();
        radioAccessPrivate.click();
    }

    public void clickBtnCrtRepo() {
//        driver.findElement(btnCreateRepo).click();
        btnCreateRepo.click();
    }

    public void displaySetup() {
//        driver.findElement(setup).isDisplayed();
        setup.isDisplayed();
    }

    public void displayFailRepo() {
        String nameRepoRequired = failedRepo.getText();
        System.out.println(nameRepoRequired);
//        driver.findElement(failedRepo).isDisplayed();
        failedRepo.isDisplayed();
        Assert.assertEquals("Repository creation failed.", nameRepoRequired);
    }

    public void displayRepoSudahAda() {
        String repoSudahAda = failedRepo.getText();
        System.out.println(repoSudahAda);
//        driver.findElement(failedRepo).isDisplayed();
        failedRepo.isDisplayed();
        Assert.assertEquals("Repository already exist", repoSudahAda);
    }

    public void getAccessRepoPublic() {
        String acsRepoPublic = accessRepoPublic.getText();
        System.out.println(acsRepoPublic);
//        driver.findElement(accessRepoPublic).isDisplayed();
        accessRepoPublic.isDisplayed();
        Assert.assertEquals("Public", acsRepoPublic);
    }

    public void getAccessRepoPrivate() {
        String acsRepoPrivate = accessRepoPrivate.getText();
        System.out.println(acsRepoPrivate);
//        driver.findElement(accessRepoPrivate).isDisplayed();
        accessRepoPrivate.isDisplayed();
        Assert.assertEquals("Private", acsRepoPrivate);
    }
}
