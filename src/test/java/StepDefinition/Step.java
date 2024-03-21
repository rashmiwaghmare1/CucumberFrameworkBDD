package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObeject.Add_New_Customer;
import PageObeject.LoginPg;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Step {
	public WebDriver driver;
	public LoginPg loginpg;
	public Add_New_Customer add;
	 
	
	@Given("User lauch chrome browser")
	public void user_lauch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		loginpg=new LoginPg(driver);
		add =new Add_New_Customer(driver);
	}
	@When("User open Url {string}")
	public void user_open_url(String url) {
	    driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}

	@When("User Enter email{string}")
	public void user_enter_email_admin_yourstore_com(String emailad) {
		loginpg.enterEmail(emailad);
	}

	@When("Enter password{string}")
	public void enter_password_admin(String pass) {
		loginpg.enterPassword(pass);
	}

	@When("Click on login")
	public void click_on_login() {
		loginpg.loginButton();
	}
	@Then("Page title should be{string}")
	public void page_title_should_be_dashboard_nop_commerce_administration(String expectedTitle ) {
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

	@When("Click on logout link")
	public void click_on_logout_link() {
	    loginpg.logoutButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.close();
	}
	//Add new Customer////////
	@When("User click on Customers menu")
	public void user_click_on_customers_menu() {
		add.clickCustomerMenu();
	}

	@When("User click on Customers")
	public void user_click_on_customers() {
	    add.clickCustomers();
	}

	@When("USer click on Add new button")
	public void u_ser_click_on_add_new_button() {
	   add.clickAdd();
	}

	@Then("User can view Add a new customer Page")
	public void user_can_view_add_a_new_customer_page() {
	   String actualTitle=driver.getTitle();
	   String expectedTitle="Customers / nopCommerce administration";
	}

	@When("User enter Customer info")
	public void user_enter_customer_info() {
	   add.enterEmail("maria@gmail.com");
	   add.enterPassword("maria"); 
	   add.enterFirst("Maria");
	   add.enterLast("Elsher");
	   add.clickGender();
	   add.dateOfBirth();
	   add.enterCompany("Google");
	   add.clickTax();
	   add.enterVendor("Vendor 1");
	   add.clickActive();
	   add.enterAdmin("This is admin comment");
	   
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
	   add.clickSaveButton();
	}

	@Then("User should get confirmation message")
	public void user_should_get_confirmation_message() {
	   String actualMess= driver.findElement(By.tagName("Body")).getText();
	   String expectedMess="The new Customer has been added successfully";
	   Assert.assertNotSame(actualMess,expectedMess);
	}



	@Then("User can view Customers Page")
	public void user_can_view_customers_page() {
	   String expectedTitle="Customers / nopCommerce administration" ;
	   String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
	}

	@When("User enter email")
	public void user_enter_email() {
	   add.enterSearchEmail("kiyjcycyhjc676008@gmail.com");
	}

	@When("click on search button")
	public void click_on_search_button() {
	    add.clickSearchButton();
	}

	@Then("User found data available in table")
	public void user_found_data_available_in_table() {
	    String expectedEmailString="kiyjcycyhjc676008@gmail.com";
	    if(add.searchByEmail(expectedEmailString)==true){
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	}

	@Then("close browser")
	public void close_Browser() {
	   driver.close();
	}






	
	
	}





