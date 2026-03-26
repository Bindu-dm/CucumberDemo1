package stepsDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;

    @Given("the user is on the OrangeHRM login page")
    public void navigateToLoginPage() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("the user enters valid credentials \\(username: {string}, password: {string})")
    public void enterCredentials(String user, String pwd) {

        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pwd);
    }

    @When("the user clicks on the Login button")
    public void clickLogin() {

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("the user should be redirected to the Dashboard page")
    public void verifyDashboardPage() {

        boolean status = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Then("the user should see the Dashboard text")
    public void verifyDashboardText() {

        boolean dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        Assert.assertTrue(dashboardText);

        //driver.quit();
    }
}