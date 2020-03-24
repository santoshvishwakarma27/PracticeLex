package PkgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\santosh\\workspace\\Test\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("jenkins test SCM polling");
  }
}
