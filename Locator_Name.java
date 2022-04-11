package ABC_Demo004;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;



public class Locator_Name {
	
	static WebDriver driver;
	 
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin";
	String Password="admin123";
	String Skill_Name="Java10";
	String Skill_Description="Programing Language";
			
	
  @Test
  public void LocatorName() throws Exception {
	  
	  driver=TestBrowser.OpenChromeBrowser();
	  
	  Locator_Name.OpenOrangeHRM(TestURL);
	  Locator_Name.Login(UserName,Password);
	  Locator_Name.AddSkill(Skill_Name,Skill_Description);
	  
  }
	  public static void OpenOrangeHRM(String TestURL1)throws Exception {

			driver.get(TestURL1);
	}
	  
	  public static void Login(String UserName1, String Password1)throws Exception {
		  
		  findElement(By.name("txtUsername")).sendKeys("Admin");
			findElement(By.name("txtPassword")).sendKeys("admin123");
			findElement(By.name("Submit")).click();
	  }

	  public static void AddSkill(String Skill_Name1,String Skill_Description1)throws Exception {
		  
		  findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Qualifications")).click();
			findElement(By.id("menu_admin_viewSkills")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.name("skill[name]")).sendKeys(Skill_Name1);
			findElement(By.name("skill[description]")).sendKeys(Skill_Description1);
			findElement(By.name("btnSave")).click();
			
			
						
							
	  }

	  public static WebElement findElement(By by) throws Exception {

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
		 
			}
			return elem;
		  
		  
	  }
	}
