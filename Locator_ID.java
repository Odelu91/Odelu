package ABC_Demo004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Locator_ID {
	
	 WebDriver driver;
  @Test
  public void LocatorID () throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
			//driver.get("https://flipkart.com");
			
			
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();			
			driver.findElement(By.id("menu_admin_Qualifications")).click();
			driver.findElement(By.id("menu_admin_viewSkills")).click();
			driver.findElement(By.id("btnAdd")).click();
			driver.findElement(By.id("skill_name")).sendKeys("Java9");
			driver.findElement(By.id("skill_description")).sendKeys("programing Language");
			driver.findElement(By.id("btnSave")).click();
  }
}
