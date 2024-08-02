package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTestStepst2 {

    WebDriver driver=null;

    @Given("browser is open t2")
    public void browser_is_open_t2() {
        System.out.println("Inside Step - browser is open t2");

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @Given("user is on login page t2")
    public void user_is_on_login_page_t2() {
        System.out.println("Inside Step - user is on login page t2");
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enter username and password t2")
    public void user_enter_username_and_password_t2() {
        System.out.println("Inside Step - user enter username and password t2");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("user click login button t2")
    public void user_click_login_button_t2() {
        System.out.println("Inside Step - user click login button t2");
        driver.findElement(By.id("submit")).click();
    }

    @Then("user is navigated to home page t2")
    public void user_is_navigated_to_home_page_t2() {
        System.out.println("Inside Step - user is navigated to home page t2");
        driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/");
        driver.getPageSource().contains("Congratulations");
        driver.getPageSource().contains("Log out");
        driver.close();
        driver.quit();

    }


}
