package PkgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(PkgTest.ListenerEx.class)
@Test
//@Ignore
public class Google2 {
  //@Test(groups="Pass")
  public void launchGoogle2() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling pass TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
  }
  
  //@Test(groups="Fail")
  public void launchGoogle2A() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling failed TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
  }
  
  @Parameters({"Username"})
  @Test(dependsOnMethods= {"launchGoogle2A"})
  public void launchGoogle2B(String Username) 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");	
		System.out.print("username parameter value is"+Username);
		Assert.assertEquals("Santosh", Username);  
  }
}
