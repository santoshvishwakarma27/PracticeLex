package PkgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PkgTest.ListenerEx.class)
public class Google1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google1");
  }
}
