package ABC_Demo004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Locator_LinkText {
	
	static WebDriver driver;
	
  @Test
  public void LocatorLinkText() throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Qualifications")).click();
	     driver.findElement(By.linkText("Skills")).click();  
	    driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("skill_name")).sendKeys("Java12");
		driver.findElement(By.id("skill_description")).sendKeys("programing Language");
		driver.findElement(By.id("btnSave")).click();
	  
  }
}
