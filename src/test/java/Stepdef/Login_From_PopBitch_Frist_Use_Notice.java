package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Elements.Login_Page_Elements;
import Elements.PopbitchFirstUseNoticeElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_From_PopBitch_Frist_Use_Notice {
	static WebDriver driver_Login_From_PopBitch_Frist_Use_Notice ;					//driver_Login_From_PopBitch_Frist_Use_Notice



	
	
	PopbitchFirstUseNoticeElements pop_first_use = new PopbitchFirstUseNoticeElements(driver_Login_From_PopBitch_Frist_Use_Notice);
	
	@Given("^I am a registered user , I open the browser$")
	@Test
	public void i_am_a_registered_user_I_open_the_browser() throws Throwable {
		driver_Login_From_PopBitch_Frist_Use_Notice = new SafariDriver();
		System.out.println("Browseropened");
	}
	

	
	
	@Given("^I navigate to popbitch\\.com$")
	@Test(priority=0)
	public void i_navigate_to_popbitch_com() throws Throwable {
		
		driver_Login_From_PopBitch_Frist_Use_Notice.get("https://popbitch.com");
		System.out.println("Successfull navigation tot popbitch");
	}
	
	@When("^I click on the Stories Menu$")
	@Test(priority=1)
	public void i_click_on_the_Stories_Menu() throws Throwable {
		Thread.sleep(4000);
		PopbitchFirstUseNoticeElements pop_first_use = new PopbitchFirstUseNoticeElements(driver_Login_From_PopBitch_Frist_Use_Notice);
		pop_first_use.Click_On_Popbitch_Stories_Menu();
		System.out.println("List of premium stories");
	}
	
	@When("^I click on the Premium Story$")
	@Test(priority=2)
	public void i_click_on_the_Premium_Story() throws Throwable {
		Thread.sleep(2000);
		PopbitchFirstUseNoticeElements pop_first_use = new PopbitchFirstUseNoticeElements(driver_Login_From_PopBitch_Frist_Use_Notice);
		pop_first_use.Click_On_Popbitch_Premium_Story();
		System.out.println("Premium story selected");
	}
	
	@When("^I Click on Login to Agate from the Pop Bitch First use notice$")
	@Test(priority=3)
	public void i_Click_on_Login_to_Agate_from_the_Pop_Bitch_First_use_notice() throws Throwable {
		Thread.sleep(1000);
		driver_Login_From_PopBitch_Frist_Use_Notice.manage().window().maximize();
		PopbitchFirstUseNoticeElements pop_first_use = new PopbitchFirstUseNoticeElements(driver_Login_From_PopBitch_Frist_Use_Notice);
		pop_first_use.Click_On_Popbitch_First_Use_Notice_Login();
		System.out.println("Clicked on login");
	}

	
	@Then("^I verify that the Login Button Navigates me to the login page$")
	@Test(priority=4)
	public void i_verify_that_the_Login_Button_Navigates_me_to_the_login_page() throws Throwable {
		String Login_From_PopBitch_Frist_Use_Notice_Current_Url= driver_Login_From_PopBitch_Frist_Use_Notice.getCurrentUrl();
	    System.out.println(Login_From_PopBitch_Frist_Use_Notice_Current_Url);
	    String Login_From_PopBitch_Frist_Use_Notice_Popbitch_Login_Url = "https://wallet-notices.agate.io/my-agate/sign-in?publication_name=Popbitch&pub_id=popbitch&url_from=https%3A%2F%2Fpopbitch.com%2F2018%2F10%2Fii-defective-inspector%2F";
	    Assert.assertEquals(Login_From_PopBitch_Frist_Use_Notice_Current_Url, Login_From_PopBitch_Frist_Use_Notice_Popbitch_Login_Url);
	    System.out.println("Successfully navigated to login page");
	}
	
	
	
	
	@When("^I Login with correct Details$")
	@Test(priority=5)
	public void i_Login_with_correct_Details() throws Throwable {
		Login_Page_Elements Login_Pop_First_Use = new Login_Page_Elements(driver_Login_From_PopBitch_Frist_Use_Notice);
		Thread.sleep(3000);
		Login_Pop_First_Use.Login_Process("jayashree.kamineni90@gmail.com", "ajjukanna");
		System.out.println("Login successfull");
	}
	
	@Then("^I verify that I am navigated to the full article$")
	@Test(priority=6)
	public void i_verify_that_I_am_navigated_to_the_full_article() throws Throwable {
		
		Thread.sleep(3000);
		String Login_From_PopBitch_Frist_Use_Notice_Current_Url1= driver_Login_From_PopBitch_Frist_Use_Notice.getCurrentUrl();
	    System.out.println(Login_From_PopBitch_Frist_Use_Notice_Current_Url1);
	    String Login_From_PopBitch_Frist_Use_Notice_Popbitch_Login_Url1 = "https://popbitch.com/2018/10/ii-defective-inspector/";
	    Assert.assertEquals(Login_From_PopBitch_Frist_Use_Notice_Current_Url1, Login_From_PopBitch_Frist_Use_Notice_Popbitch_Login_Url1);
	    System.out.println("Complete article opened");
		
		
	}
	
	
	
}
