package FIRST_PROJECT;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  String homepageTitle = driver.getTitle();
//	  Assert.assertEquals(homepageTitle, "Google");
	  Assert.assertEquals(homepageTitle, "Google");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  //TEST HOME 05/03/2019
	  // TEST HOME 04/03/2019
	  // TEST HOME 03/03/2019
	  
	  //Firefox
	  driver = new FirefoxDriver();
	  
	  //Chrome 
//	  System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
//	  driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
