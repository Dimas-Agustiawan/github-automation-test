package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.browser;
import pages.create_repository;
import pages.login;


public class CreateRepository extends browser {
    create_repository cr;
    login lg;
    @Given("User membuat repository")
    public void userMembuatRepository() {
        loginGithub();
        cr = PageFactory.initElements(driver, create_repository.class);
        lg = PageFactory.initElements(driver, login.class);
    }

    @When("^User melakukan login dengan (.*) dan (.*)$")
    public void userMelakukanLogin(String email, String pass) {
        lg.inputEmail(email);
        lg.inputPass(pass);
        lg.clickBtnLogin();
    }

    @And("^User input nama repository (.*)$")
    public void userInputNamaRepositgory(String nameRepository) {
        cr.inputRepo(nameRepository);
    }

    @And("User mengklik radio button public")
    public void userMengklikRadioButtonPublic() {
        cr.checkedAccessPublic();
    }

    @And("User mengklik button create repository")
    public void userMengklikButtonCreateRepository() {
        cr.clickBtnCrtRepo();
    }

    @Then("Menampilkan halaman setup")
    public void menampilkanHalamanSetup() {
        String setup = driver.findElement(By.xpath("//strong[contains(text(),'Quick setup')]")).getText();
        cr.displaySetup();
        Assert.assertEquals("Quick setup", setup);
    }

    @Then("Menampilkan pesan repository creation failed")
    public void menampilkanPesanRepositoryCreationFailed() {
        cr.displayFailRepo();
    }

    @And("User mengklik radio button private")
    public void userMengklikRadioButtonPrivate() {
        cr.checkedAccessPrivate();
    }

    @And("Access repository public")
    public void accessRepositoryPublic() {
        cr.getAccessRepoPublic();
    }

    @And("Access repository private")
    public void accessRepositoryPrivate() {
        cr.getAccessRepoPrivate();
    }
}
