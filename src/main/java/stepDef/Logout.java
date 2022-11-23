package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.browser;
import pages.login;
import java.util.concurrent.TimeUnit;

public class Logout extends browser {
    login lg = PageFactory.initElements(driver, login.class);

    @Given("Buka browser")
    public void bukaBrowser() {
        loginGithub();
    }

    @When("^User login dengan (.*) dan (.*)$")
    public void userMelakukanLogin(String email, String pass) {
        lg.inputEmail(email);
        lg.inputPass(pass);
        lg.clickBtnLogin();
    }

    @When("User tidak melakukan aktivitas selama {int} menit")
    public void userTidakMelakukanAktivitasSelamaMenit(int arg0) {
        driver.manage().timeouts().implicitlyWait(arg0, TimeUnit.MINUTES);
    }

    @Then("Akun akan logout otomatis")
    public void akunAkanLogoutOtomatis() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://github.com/", url);
    }
}
