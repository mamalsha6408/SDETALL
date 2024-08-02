package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchStepst1 {


    WebDriver driver=null;

    @Given("browser is open t1")
    public void browser_is_open_t1() {
        System.out.println("Inside Step - browser is open t1");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @Given("user is open google search page t1")
    public void user_is_open_google_search_page_t1() {
        System.out.println("Inside Step - user is open google search page t1");
        driver.navigate().to("https://www.google.lk/");
    }
    @When("user enters a text in searchbox t1")
    public void user_enters_a_text_in_searchbox_t1() {
        System.out.println("Inside Step - user enters a text in searchbox t1");
        driver.findElement(By.name("q")).sendKeys("Diy Tech Hub");
    }
    @When("hits enter t1")
    public void hits_enter_t1() {
        System.out.println("Inside Step - hits enter t1");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user navigate to result page t1")
    public void user_navigate_to_result_page_t1() {
        System.out.println("Inside Step - user navigate to result page t1");
        driver.getPageSource().contains("Diy Tech Hub");
        driver.close();
        driver.quit();
    }


}
