package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HooksDemoStepst7 {

    WebDriver driver;

    @Before
    public void tearUp(){
        System.out.println("---Tear up---");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("---Tear down---");
        driver.close();
        driver.quit();
    }

    @Given("user is on login page t7")
    public void user_is_on_login_page_t7() {
        System.out.println("---Inside Step 1---");
    }

    @When("user enter valid username and password t7")
    public void user_enter_valid_username_and_password_t7() {
        System.out.println("---Inside Step 2---");
    }

    @When("clciks login button t7")
    public void clciks_login_button_t7() {
        System.out.println("---Inside Step 3---");
    }

    @Then("user is navigated to home page t7")
    public void user_is_navigated_to_home_page_t7() {
        System.out.println("---Inside Step 4---");
    }

}
