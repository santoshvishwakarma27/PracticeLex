package PkgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PkgTest.ListenerEx.class)
public class Google3 {
	public int invokeCount=0;
  //@Test(groups="Pass")
  public void launchGoogle3A() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling pass TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		driver.quit();
  }
  
  //@Test(groups="Fail")
  public void launchGoogle3B() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling failed TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google1");
		driver.quit();
  }
  
  @Test(groups="Pass", invocationCount=2)
  public void launchGoogle3C() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		invokeCount=invokeCount+1;
		System.out.print("Invocation count= "+invokeCount);
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		driver.quit();
  }
}
