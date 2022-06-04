package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.learning.driver.DriverManager;
import com.learning.utils.SeleniumUtils;

public class TopMenuComponent {
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement LNK_Admin;
	
//	@FindBy(id="menu_pim_viewPimModule")
//	private WebElement LNK_PIM;
//	
//	@FindBy(id="menu_leave_viewLeaveModule")
//	private WebElement LNK_LEAVE;
//	
	//Dynamic String locator Way
	
	private String topMenus = "menu_%replaceable%";
	
	
	public TopMenuComponent() {
		
		PageFactory.initElements(DriverManager.getDr(), this);
	}
	
	
	
	public void clickMenuOption() {
		
		LNK_Admin.click();
		
		}
	
	public void clickMenuOptionsUsingDynamicWay() {
		
		String pim_ViewModule = topMenus.replaceAll("%replaceable%","pim_viewPimModule");
		//SeleniumUtils.click(By.id(pim_ViewModule));
		SeleniumUtils.click(By.id(pim_ViewModule), "ViewModule");
		
		
		
		
		
	}
	
	

}
