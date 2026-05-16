package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class ExcelWithAllTestCases
        extends BaseTest {

    private LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {

        loginPage =
                new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void enter_credentials(
            String username,
            String password) {

        loginPage.enterUsername(username);

        loginPage.enterPassword(password);
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {

        loginPage.clickLogin();
    }

    @Then("login result should be {string}")
    public void login_result_should_be(
            String expectedResult) {

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10)
                );

        if(expectedResult
                .equalsIgnoreCase("success")) {

            wait.until(
                    ExpectedConditions
                            .urlContains("profile")
            );

            Assert.assertTrue(
                    loginPage
                            .isLoginSuccessful()
            );
        }

        quitDriver();
    }
}