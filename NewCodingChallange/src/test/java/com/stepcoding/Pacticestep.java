package com.stepcoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  Pacticestep {
WebDriver driver;
 
	
	

@Given("^user go to your logo homepage$")
public void user_go_to_your_logo_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
  
}

@When("^user enter valid Email address and password$")
public void user_enter_valid_Email_address_and_password() throws Throwable {
    
  ;
}

@When("^user click on the log in button$")
public void user_click_on_the_log_in_button() throws Throwable {
    
  ;
}

@Then("^user navigate to the welcome page$")
public void user_navigate_to_the_welcome_page() throws Throwable {
    
  ;
}

@Then("^user verify the page title as\"([^\"]*)\"$")
public void user_verify_the_page_title_as(String arg1) throws Throwable {
    
  ;
}

@Then("^verify user name is displays at top left$")
public void verify_user_name_is_displays_at_top_left() throws Throwable {
    
  ;
}

@Then("^user click on upper left corner Dresses$")
public void user_click_on_upper_left_corner_Dresses() throws Throwable {
    
  ;
}

@Then("^click on sort by$")
public void click_on_sort_by() throws Throwable {
    
  ;
}

@Then("^select highest first$")
public void select_highest_first() throws Throwable {
    
  ;
}

@Then("^user select the second dress from the list$")
public void user_select_the_second_dress_from_the_list() throws Throwable {
    
  ;
}

@Then("^user click on add to cart$")
public void user_click_on_add_to_cart() throws Throwable {
    
  ;
}

@Then("^user verify total price with shipping is there$")
public void user_verify_total_price_with_shipping_is_there() throws Throwable {
    
  ;
}

@Then("^user sign out$")
public void user_sign_out() throws Throwable {
    
  ;
}

@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
    
  ;
}


	
	
	
	
	

}
