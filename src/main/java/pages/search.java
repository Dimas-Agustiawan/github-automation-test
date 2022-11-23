package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class search {
    protected WebDriver driver;

    public search(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "q")
    WebElement cari;

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/main/div/div[3]/div/ul/li/div[2]/div[1]/div/a[@href='/Dimas-Agustiawan/peminjaman-buku']")
    WebElement link;

//    private By cari = By.name("q");
//    private By link = By.xpath("/html/body/div[5]/main/div/div[3]/div/ul/li/div[2]/div[1]/div/a[@href='/Dimas-Agustiawan/peminjaman-buku']");
//    private By repo = By.xpath("/html/body/div[5]/div/main/div/div[1]/div/div/strong/a[@href='/Dimas-Agustiawan/peminjaman-buku']");

    public void inputCari(String txtCari) {
//        driver.findElement(cari).sendKeys(txtCari);
        cari.sendKeys(txtCari);
    }

    public void enterCari() {
//        driver.findElement(cari).sendKeys(Keys.ENTER);
        cari.sendKeys(Keys.ENTER);
    }

    public void clickLinkHasil() {
//        driver.findElement(link).click();
        link.click();
    }

    public void displayRepo() {
        driver.getTitle();
    }
}
