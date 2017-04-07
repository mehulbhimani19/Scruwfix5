package software;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import javax.swing.*;
import java.util.List;

/**
 * Created by Mehul on 25/02/2017.
 */



public class RegisterStepDeft extends DriverManager
{
   @FindBy(linkText = "Continue")
    private WebElement _continue;
//
   @FindBy (name = "Email")
   private WebElement _email;



    @Given("^I am home page of Screwfix$")
    public void i_am_home_page_of_Screwfix()
    {
      setUp();

    }

    @Given("^I click on your account link text$")
    public void i_click_on_your_account_link_text()
    {
     driver.findElement(By.xpath(".//*[@id='header_link_sign_in']/i")).click();

    }

    @Given("^I click on on Register now link$")
    public void i_click_on_on_Register_now_link()
    {
        driver.findElement(By.xpath(".//*[@id='id-signin-details']/div/form/button")).click();

    }

    @When("^I enter valid email address$")
    public void i_enter_valid_email_address()
    {
    String email = "kabhikabhi"+Utility.randomDate()+"@yahoo.com";
    driver.findElement(By.name("Email")).sendKeys(email);
        System.out.println(email);
      //Utility.enterText(_email ,"kabhikabhi"+Utility.randomDate()+"@yahoo.com\"");
    }

    @And("^I click on continue button$")
    public void i_click_on_continue_button()
    {
        driver.findElement(By.id("continueRegistrationButton")).click();
    }

    @And("^I select Mr form drop down list$")
    public void i_select_Mr_form_drop_down_list()
    {
        Select select = new Select(driver.findElement(By.id("newTitle")));
        select.selectByVisibleText("Mr");

//       Utility.selectbyVisibleText(driver.findElement(By.id("newTitle")),Mr);
    }

    @When("^I enter valid first name on firstname filed$")
    public void i_enter_valid_first_name_on_firstname_filed()
    { driver.findElement(By.id("firstName")).sendKeys("kabhi");

    }

    @When("^I enter valid last name on lastname filed$")
    public void i_enter_valid_last_name_on_lastname_filed()
    {
       driver.findElement(By.id("lastName")).sendKeys("kabhi");
    }

    @When("^I select profation form drop down list$")
    public void i_select_profation_form_drop_down_list()
    {
       Select select = new Select(driver.findElement(By.id("profession")));
        select.selectByVisibleText("Decorator");
    }

    @When("^I enter my postcode$")
    public void i_enter_my_postcode()
    {
   driver.findElement(By.id("contact-search-postcode")).sendKeys("HA0 2LF");
    }

    @When("^I click on find address$")
    public void i_click_on_find_address() throws InterruptedException { //  Utility.WaitExplicitly(driver.findElement(By.xpath(".//*[@id='addressSearchForm']/div[2]/div/div[1]/button")),15);
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='addressSearchForm']/div[2]/div/div[1]/button")).click();
    }

    @When("^I select valid address form drop down list$")
    public void i_select_valid_address_form_drop_down_list()
    {

//       List<WebElement>  = driver.findElements(By.xpath(".//*[@id='ADDRESS_']"));
//
//        System.out.println(addreshlist.size());
//
//        for (WebElement temp : addreshlist)
//        {
//            System.out.println(temp.getText());
//        }



       Select select = new Select(driver.findElement(By.xpath(".//*[@id='contact-address-result-select']")));
        select.selectByVisibleText("53 District Road, WEMBLEY, Middlesex HA0 2LF");
    }

    @When("^I enter valid password in password filed$")
    public void i_enter_valid_password_in_password_filed()
    {
   driver.findElement(By.id("password")).sendKeys(("Password123"));
    }

    @When("^I  retype same password in password field$")
    public void i_retype_same_password_in_password_field()
    {
        driver.findElement(By.id("retypePassword")).sendKeys("Password123");
    }

    @When("^I click on Register now link$")
    public void i_click_on_Register_now_link()
    {
//      Utility.captureScreenShort(driver, "Registration");
//     driver.findElement()
    }

    @Then("^I should see welcome massage$")
    public void i_should_see_welcome_massage()
    {

    }
}
