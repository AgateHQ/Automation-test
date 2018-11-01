package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopbitchFirstUseNoticeElements {

	WebDriver driver_PopbitchFirstUseNoticeElements;														//driver_PopbitchFirstUseNoticeElements
	
	//Popbitch First use Notice elements finding
	By green_tab= By.id("agateposter");																		//green tab
	By Nav_To_First_Use_Stories= By.xpath("//*[@id=\"menu-item-35878\"]/a");								//stories
	By Nav_To_First_Use_PremiumStory= By.xpath("//*[@id=\"post-38600\"]/div/div[2]/header/h2/a");		//first premium story
	By First_use_Login=By.linkText("Log in to Agate");														//login to agate
	By First_Use_CreateWallet= By.linkText("Create Your Agate Wallet");										//create wallet
	By First_Use_WhatIsAgate= By.linkText("What is Agate?");												//what is Agate
	
	


	public PopbitchFirstUseNoticeElements(WebDriver driver_PopbitchFirstUseNoticeElements2) {							//constructor
		this.driver_PopbitchFirstUseNoticeElements= driver_PopbitchFirstUseNoticeElements2;
		}
	
	
	public void Popbitch_premium_Story_Elements_Displayed()													//Check if all elements displayed on First use notice
	{
		Boolean Pop_First_Use_Notice_Create_Wallet_Displayed = driver_PopbitchFirstUseNoticeElements.findElement(First_Use_CreateWallet).isDisplayed();
		System.out.println(Pop_First_Use_Notice_Create_Wallet_Displayed);
		Boolean Pop_First_Use_Notice_Login_to_Agate_displayed = driver_PopbitchFirstUseNoticeElements.findElement(First_use_Login).isDisplayed();
		System.out.println(Pop_First_Use_Notice_Login_to_Agate_displayed);
		Boolean Pop_First_Use_Notice_What_Is_Agate_Displayed = driver_PopbitchFirstUseNoticeElements.findElement(First_Use_WhatIsAgate).isDisplayed();
		System.out.println(Pop_First_Use_Notice_What_Is_Agate_Displayed);
		}
	
	public  void Click_On_Popbitch_Stories_Menu() throws InterruptedException {	
		Thread.sleep(1000);
		driver_PopbitchFirstUseNoticeElements.findElement(Nav_To_First_Use_Stories).click();
		}
	
	public void Click_On_Popbitch_Premium_Story() throws InterruptedException {															//click on popbitch premium story	
		Thread.sleep(1000);
		driver_PopbitchFirstUseNoticeElements.findElement(Nav_To_First_Use_PremiumStory).click();
		}
	
	public void Click_On_Popbitch_First_Use_Notice_Login() throws InterruptedException {					//Login from popbitch First use Notice	
		Thread.sleep(1000);
		driver_PopbitchFirstUseNoticeElements.findElement(First_use_Login).click();
		}
	
	public void Click_On_Popbitch_First_Use_Notice_Create_Wallet() {										//Register from popbitch First use Notice
		driver_PopbitchFirstUseNoticeElements.findElement(First_Use_CreateWallet).click();
		}
		
	public void Click_On_Popbitch_First_Use_Notice_What_Is_Agate() {										//What is Agate from popbitch First use Notice
		driver_PopbitchFirstUseNoticeElements.findElement(First_Use_WhatIsAgate).click();
		}

	
	
	
	
	
	
	
	
	
	
	
}
