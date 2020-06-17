package PkgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PkgTest.ListenerEx.class)
public class Google1 {
  @Test(groups="Pass")
  public void launchGoogle() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling pass TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.print("Test Commit");
		System.out.print("Changes in repo 2 ");
  }
  
  @Test(groups="Fail")
  public void launchGoogle1() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling failed TC");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google1");
  }
}
