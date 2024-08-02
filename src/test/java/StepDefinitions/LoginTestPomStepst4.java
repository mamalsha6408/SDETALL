package StepDefinitions;

import Pages.LoginPaget4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestPomStepst4 {

    WebDriver driver=null;
    LoginPaget4 login;

    @Given("browser is open t4")
    public void browser_is_open_t4() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @Given("user is on login page t4")
    public void user_is_on_login_page_t4() {

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

    }

    @When("^user enter (.*) and (.*) t4$")
    public void user_enter_username_and_password_t4(String username,String password) {

        login=new LoginPaget4(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @When("user click login button t4")
    public void user_click_login_button_t4() {

        login.clickLoginButton();

    }

    @Then("user is navigated to home page t4")
    public void user_is_navigated_to_home_page_t4() {

        System.out.println("Inside Step - user is navigated to home page t2");
        driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/");
        driver.close();
        driver.quit();

    }


}
