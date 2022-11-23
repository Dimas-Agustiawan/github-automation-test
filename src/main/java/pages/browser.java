package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
    public WebDriver driver = new ChromeDriver();

    public void loginGithub() {
        String project = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", project+"/src/main/resources/driver/chromedriver.exe");
        driver.get("https://github.com/login");
    }
}
