package StepDefinitions;

import PageFactory.LoginPageFactoryt5;
import Pages.LoginPaget4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestPFStepst5 {

    WebDriver driver=null;
    LoginPageFactoryt5 login;

    @Given("browser is open t5")
    public void browser_is_open_t5() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @Given("user is on login page t5")
    public void user_is_on_login_page_t5() {

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

    }

    @When("^user enter (.*) and (.*) t5$")
    public void user_enter_username_and_password_t5(String username,String password) {

        login=new LoginPageFactoryt5(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @When("user click login button t5")
    public void user_click_login_button_t5() {

        login.clickLogin();

    }

    @Then("user is navigated to home page t5")
    public void user_is_navigated_to_home_page_t5() {

        driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/");
        driver.close();
        driver.quit();

    }


}
