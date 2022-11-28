package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.browser;
import pages.login;
import pages.logout;

import java.util.concurrent.TimeUnit;

public class Logout extends browser {
    login lg;
    logout lt = PageFactory.initElements(driver, logout.class);

    @Given("User logout")
    public void bukaBrowser() {
        lg = PageFactory.initElements(driver, login.class);
        loginGithub();
    }

    @When("^Login dengan (.*) dan (.*)$")
    public void userMelakukanLogin(String email, String pass) {
        lg.inputEmail(email);
        lg.inputPass(pass);
        lg.clickBtnLogin();
    }

    @And("User tidak melakukan aktivitas selama {int} menit")
    public void userTidakMelakukanAktivitasSelamaMenit(int waktu) throws InterruptedException {
        Thread.sleep(3600000);
    }

    @Then("Akun akan logout otomatis")
    public void akunAkanLogoutOtomatis() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://github.com/login", url);
    }

    @And("User image akun github")
    public void userImageAkunGithub() {
        lt.clickImg();
    }

    @And("Klik dropdown logout")
    public void klikDropdownLogout() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        lt.clickLogout();
    }

    @Then("Menampilkan halaman dashboard")
    public void menampilkanHalamanDashboard() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("GitHub: Let’s build from here · GitHub", title);
    }
}
