package ABC_Demo004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Locator_Partial_LinkText {
	
	static WebDriver driver;
	
  @Test
  public void Locator_partialLinkText()throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  driver.get("https://mail.google.com/");
	 // driver.findElement(By.linkText("Gmail")).click();
	  driver.findElement(By.partialLinkText("Inbox")).click();
	  
	  //not working properly but this is the concept;
	  
	  
	  
  }
}
