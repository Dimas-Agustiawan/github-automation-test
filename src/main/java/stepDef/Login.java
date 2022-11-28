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

public class Login extends browser {
    login lg;
    @Given("User login ke github")
    public void userLoginKeGithub() {
        lg = PageFactory.initElements(driver, login.class);
        loginGithub();
    }

    @When("^User input email (.*)$")
    public void userInputEmail(String email) {
        lg.inputEmail(email);
    }

    @And("^User input password (.*)$")
    public void userInputPassword(String pass) {
        lg.inputPass(pass);
    }

    @And("User klik button sign in")
    public void userKlikButtonSignIn() {
        lg.clickBtnLogin();
    }

    @Then("Menampilkan halaman awal github")
    public void menampilkanHalamanAwalGithub() {
        lg.displayHome();
    }

    @Then("Menampilkan pesan email required")
    public void menampilkanPesanEmailHarusTerisi() {
        String email = driver.findElement(By.className("js-flash-alert")).getText();
        lg.pesanPeringatan();
        Assert.assertEquals("email required", email);
    }

    @And("Menampilkan pesan password required")
    public void menampilkanPesanPasswordHarusTerisi() {
        String pass = driver.findElement(By.className("js-flash-alert")).getText();
        lg.pesanPeringatan();
        Assert.assertEquals("password required", pass);
    }

    @Then("Menampilkan pesan Incorrect username or password")
    public void menampilkanPesanEmailAtauPasswordSalah() {
        String incorrect = driver.findElement(By.className("js-flash-alert")).getText();
        lg.pesanPeringatan();
        System.out.println(incorrect);
        Assert.assertEquals("Incorrect username or password.", incorrect);
    }
}
