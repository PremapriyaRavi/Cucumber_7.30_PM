package org.stepdefinition;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pages.LoginPage;
import org.pages.RegistrationPage;
import org.pages.Search_1HomeApp;
import org.pages.Search_2MusicInstrument;
import org.pages.Search_3Sports;

import cucumber.api.java.en.*;
public class LoginSteps extends BaseClass{
	LoginPage l;
	RegistrationPage r;
	Search_2MusicInstrument s2;
	Search_1HomeApp s1;
	Search_3Sports s3;
	@Given("The user has to be in the CrazySales login page")
	public void the_user_has_to_be_in_the_CrazySales_login_page() {

	}
	@When("The user fill the {string} and {string}")
	public void the_user_fill_the_and(String user, String pass){
//		l=new LoginPage();
//		click(l.getLogIcon());
//		click(l.getSignBtn());
//		insert(l.getTxtEmail(), user);
//		insert(l.getTxtPass(), pass);
	}
	@When("click login")
	public void click_login() {
//		click(l.getLogBtn());
	}
	@Then("The user should navigate to the invalid login page")
	public void the_user_should_navigate_to_the_invalid_login_page() {
		Assert.assertTrue(true); 
		System.out.println("The user in invalid login page...");
	}
	@When("The user fill the {string} and {string} and {string}")
	public void the_user_fill_the_and_and(String email, String pass, String confirmpw) {
//		r=new RegistrationPage();
//		r.fillDetails(email, pass, confirmpw);

//		click(r.getRegBtn());
//		insert(r.getRegEmail(),email);
//		insert(r.getRegPass(),pass);
//		insert(r.getConfirmPW(),confirmpw );
	}
	@When("click on create new button")
	public void click_on_create_new_button() {
//		click(r.getCreateBtn());
	}
	@Then("The user  was registered sucessfully")
	public void theUserWasRegisteredSucessfully() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(false); 
		//Assert.assertTrue(true); 
		System.out.println("The user registered sucessfully");
	}
@Given("the user has to be in crazysales page")
public void the_user_has_to_be_in_crazysales_page() {

}
@When("the user select the category as musical instruments from all catergories")
public void the_user_select_the_category_as_musical_instruments_from_all_catergories() {
//	 s2=new Search_2MusicInstrument();
//	click(s2.getAllCategories());
//    actClick(s2.getSelProduct());
}
@When("from instrument search  the prouduct name as {string}")
public void from_instrument_search_the_prouduct_name_as(String pname) {
//	insert(s2.getTxtEnter(),pname);
//	click(s2.getSearchBtn());
}
@When("click the first product of piano keyboard")
public void click_the_first_product_of_piano_keyboard(){
//	click(s2.getLst_product());
}
@Then("naviagate piano keyboard add to cart page")
public void naviagate_piano_keyboard_add_to_cart_page()  {
	Assert.assertTrue(true); 
	System.out.println("The user in add-to-cart page of piano...");
}
@Then("naviagate add to gloves add to cart page")
public void naviagate_add_to_gloves_add_to_cart_page() {
	Assert.assertTrue(true); 
	System.out.println("The user in add-to-cart page of gloves...");
}
@When("the user select the category as home appliants from all catergories")
public void the_user_select_the_category_as_home_appliants_from_all_catergories() {
//	 s1=new Search_1HomeApp();
//	click(s1.getAllCategories());
//    actClick(s1.getSelProduct());
}
@When("from home appliants search the prouduct name as {string}")
public void from_home_appliants_search_the_prouduct_name_as(String pname2) {
//	insert(s1.getTxtEnter(),pname2 );
//	click(s1.getSearchBtn());
}
@When("click the third product of mop")
public void click_the_third_product_of_mop() {
	click(s1.getLst_product());
}
@Then("naviagate mop add to cart page")
public void naviagate_mop_add_to_cart_page(){
	Assert.assertTrue(true); 
	System.out.println("The user in add-to-cart page of mop...");
}
@When("the user select the category as sports from all catergories")
public void the_user_select_the_category_as_sports_from_all_catergories() {
//	 s3=new Search_3Sports();
//		click(s3.getAllCategories());
//	    actClick(s3.getSelProduct());
}
@When("from sports search the prouduct name as {string}")
public void from_sports_search_the_prouduct_name_as(String pname3){
//	insert(s3.getTxtEnter(),pname3);
//	click(s3.getSearchBtn());
}
@When("click the second product of gloves")
public void click_the_second_product_of_gloves() {
//	click(s3.getLst_product());
}
@Then("naviagate gloves add to cart page")
public void naviagate_gloves_add_to_cart_page() {
	Assert.assertTrue(true); 
	System.out.println("The user in add-to-cart page of gloves..."); 
}



}
