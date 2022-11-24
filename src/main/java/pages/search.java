package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
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

    public void inputCari(String txtCari) {
        cari.sendKeys(txtCari);
    }

    public void enterCari() {
        cari.sendKeys(Keys.ENTER);
    }

    public void clickLinkHasil(String nameRepository) {
        driver.findElement(By.xpath("/html/body/div[5]/main/div/div[3]/div/ul/li/div[2]/div[1]/div/a[@href='/"+nameRepository+"']")).click();
    }

    public void displayRepo() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Search · Dimas-Agustiawan/peminjaman-buku", title);
    }
}
