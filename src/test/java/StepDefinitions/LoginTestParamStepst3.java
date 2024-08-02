package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestParamStepst3 {

    WebDriver driver=null;

    @Given("browser is open t3")
    public void browser_is_open_t3() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @Given("user is on login page t3")
    public void user_is_on_login_page_t3() {

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

    }

    @When("^user enter (.*) and (.*) t3$")
    public void user_enter_username_and_password_t3(String username,String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("user click login button t3")
    public void user_click_login_button_t3() {

        driver.findElement(By.id("submit")).click();

    }

    @Then("user is navigated to home page t3")
    public void user_is_navigated_to_home_page_t3() {

        System.out.println("Inside Step - user is navigated to home page t2");
        driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/");
        driver.close();
        driver.quit();

    }


}
