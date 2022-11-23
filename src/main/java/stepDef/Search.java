package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.browser;
import pages.login;
import pages.search;

public class Search extends browser {
    search src;
    login lg;
    @Given("Cari repository")
    public void cariRepository() {
        loginGithub();
        src = PageFactory.initElements(driver, search.class);
        lg = PageFactory.initElements(driver, login.class);
        lg.inputEmail("dimasagustiawan30@gmail.com");
        lg.inputPass("Kuningan09081999");
        lg.clickBtnLogin();
//        driver.findElement(By.id("login_field")).sendKeys("dimasagustiawan30@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("Kuningan09081999");
//        driver.findElement(By.name("commit")).click();
    }

    @When("^User mengetikan (.*)$")
    public void userMengetikanNamaRepository(String nameRepository) {
        src.inputCari(nameRepository);
    }

    @And("User menekan tombol enter")
    public void userMenekanTombolEnter() {
        src.enterCari();
    }

    @Then("Menemukan link menuju ke dalam repository")
    public void menemukanLinkMenujuKeDalamRepository() {
        src.clickLinkHasil();
        src.displayRepo();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        Assert.assertEquals("Search · Dimas-Agustiawan/peminjaman-buku", title);
    }
}
