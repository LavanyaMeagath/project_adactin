package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactinrunner.Test_Runner;
import com.baseclass.Base_Class;
import com.pom.Login_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Test_Runner.driver;
	 Login_Page l = new Login_Page(driver);
	
	@Given("verify that user can able launch the url")
	public void verify_that_user_can_able_launch_the_url() throws InterruptedException {
	//	launch("chrome");
		
		url("https://adactinhotelapp.com/HotelAppBuild2/");
		maximize();
	//	Thread.sleep(2000);
	}
	@When("verify that user can able enter the user name in text box")
	public void verify_that_user_can_able_enter_the_user_name_in_text_box() {
		//impli_wait();
	//	inputvalue(driver.findElement(By.id("username")), "meagath");
		inputvalue(l.getUser(), "meagathees");
	}
	@When("verify that given user can able to enter the password in text files")
	public void verify_that_given_user_can_able_to_enter_the_password_in_text_files() {
		inputvalue(l.getPass(), "lavanya");
	}
	@Then("verify that given user can able to click login button to navigate search hotel page")
	public void verify_that_given_user_can_able_to_click_login_button_to_navigate_search_hotel_page() {
		click(l.getLogin());
	}

	@When("verify thet the user can able to select location dropdown")
	public void verify_thet_the_user_can_able_to_select_location_dropdown() {
		dropdownindex(l.getLocation(), 2);
	}
	@When("verify thet the user can able to select hotel dropdown")
	public void verify_thet_the_user_can_able_to_select_hotel_dropdown() {
		dropdownvalue(l.getHotels(), "Hotel Sunshine");
	}
	@When("verify thet the user can able to select Room_type dropdown")
	public void verify_thet_the_user_can_able_to_select_room_type_dropdown() {
		dropdownvalue(l.getRoom(), "Double");
	}
	@When("verify thet the user can able to select No_rooms dropdown")
	public void verify_thet_the_user_can_able_to_select_no_rooms_dropdown() {
		dropdownindex(l.getNo_rooms(), 2);
	}
	@When("verify thet the user can able to enter check in date")
	public void verify_thet_the_user_can_able_to_enter_check_in_date() {
		inputvalue(l.getIn_date(), "12/09/2022");
	}
	@When("verify thet the user can able to enter check out date")
	public void verify_thet_the_user_can_able_to_enter_check_out_date() {
		inputvalue(l.getOut_date(), "14/09/2022");
	}
	@When("verify thet the user can able to select adults in room")
	public void verify_thet_the_user_can_able_to_select_adults_in_room() {
		dropdownindex(l.getAdult(), 1);
	}
	@When("verify thet the user can able to select children in room")
	public void verify_thet_the_user_can_able_to_select_children_in_room() {
		dropdownvalue(l.getChild(), "2");
	}
	@Then("verify user can able to click search button")
	public void verify_user_can_able_to_click_search_button() {
		click(l.getSubmit());
	}
	@When("verify user can able to click select option")
	public void verify_user_can_able_to_click_select_option() {
		click(l.getClick());
	}
	@Then("verify user can able to click continue button and navigate to next page")
	public void verify_user_can_able_to_click_continue_button_and_navigate_to_next_page() {
		click(l.getContinue_click());
	}
	@When("verify that the user can able to enter first name")
	public void verify_that_the_user_can_able_to_enter_first_name() {
		inputvalue(l.getF_name(), "lavan");
	}
	@When("verify that the user can able to enter last name")
	public void verify_that_the_user_can_able_to_enter_last_name() {
		inputvalue(l.getL_name(), "R");
	}
	@When("verify that the user can able to enter address")
	public void verify_that_the_user_can_able_to_enter_address() {
		inputvalue(l.getAddress(), "123");
	}
	@When("verify that the user can able to enter credit card number")
	public void verify_that_the_user_can_able_to_enter_credit_card_number() {
		inputvalue(l.getCc_number(), "1234567891234567");
	}
	@When("verify that the user can able to select credit card type")
	public void verify_that_the_user_can_able_to_select_credit_card_type() {
		dropdownindex(l.getCc_type(), 2);
	}
	@When("verify that the user can able to select expiry month")
	public void verify_that_the_user_can_able_to_select_expiry_month() {
		dropdownindex(l.getExp_date(), 10);
	}
	@When("verify that the user can able to select expiry year")
	public void verify_that_the_user_can_able_to_select_expiry_year() {
		dropdowntext(l.getExp_year(), "2022");
	}
	@When("verify that the user can able to enter cvv number")
	public void verify_that_the_user_can_able_to_enter_cvv_number() {
		inputvalue(l.getCvv_number(), "1243");
	}
	@Then("verify that user can able to click booknow button")
	public void verify_that_user_can_able_to_click_booknow_button() {
		click(l.getBook_now());
	}
	@Then("verify that the user can able to click logout button to cancel the booking")
	public void verify_that_the_user_can_able_to_click_logout_button_to_cancel_the_booking() {
		click(l.getLogout());
	}

	
}
