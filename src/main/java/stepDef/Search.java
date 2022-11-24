package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
    }

    @When("^User login (.*) dan (.*)$")
    public void userLoginEmailDanPassword(String email, String pass) {
        lg.inputEmail(email);
        lg.inputPass(pass);
        lg.clickBtnLogin();
    }

    @And("^User mengetikan (.*)$")
    public void userMengetikanNamaRepository(String nameRepository) {
        src.inputCari(nameRepository);
    }

    @And("User menekan tombol enter")
    public void userMenekanTombolEnter() {
        src.enterCari();
    }

    @Then("^Menemukan (.*) yang dicari$")
    public void menemukanRepositoryYangDicari(String nameRepository) {
        src.clickLinkHasil(nameRepository);
        src.displayRepo();
    }
}
