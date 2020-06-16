package PkgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

class KP1 {
	
	
	public static WebDriver driver=new ChromeDriver();	
		
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\BrowserDrivers\\chromedriver79\\chromedriver.exe");
		driver.get("https://parts-qa.kone.com/Basket/Index#/!17@&key=1585965448722");
		driver.findElement(By.xpath("//input[@id='txtusername']")).sendKeys("johhn.konetest@gmail.com");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Sujit@123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement basketicon=driver.findElement(By.xpath("//img[@id='Basket-Icon']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(basketicon).build().perform();
		Thread.sleep(5000);
		WebElement checkout=driver.findElement(By.xpath("//a[@id='lnkorderinformationTop']"));
		checkout.click();
		Thread.sleep(10000);
//		WebElement requestd=driver.findElement(By.xpath("//*[@id=\"imgInfo\"]"));
//		String d=requestd.getAttribute("data-original-title");
//		System.out.println("Requested date inside method :"+d);
//		
//		String [] words = d.split(" ", 7);
//		int i=0;
//
//		for (String word : words)
//		{
//			i=i+1;
//			System.out.println("i="+i);
//			System.out.println(word);
//		}
			
		
	}
	
	public String requestDate()
	{
		WebElement requestd=driver.findElement(By.xpath("//*[@id=\"imgInfo\"]"));
		String d=requestd.getAttribute("data-original-title");
		//System.out.println("Requested date inside method :"+d);
		
		String [] words = d.split(" ", 7);
		int i=0;

		for (String word : words)
		{
			i=i+1;
			//System.out.println("i="+i);
			//System.out.println(word);
			if(i==7)
			{
				System.out.println("Returned date inside method :"+word);
				return word;				
			}
		}
		return "";
	}
	
	public void comparedate(String beforechangedate)
	{
		String changeddate="11-05-2020";
		String changeddate1="06-04-2020";
		boolean b=beforechangedate.equalsIgnoreCase(changeddate);
		System.out.println("Date equals t/f(This should be False): "+b);
		
		boolean c=beforechangedate.equalsIgnoreCase(changeddate1);
		System.out.println("Date equals t/f (this should be True): "+c);
		Assert.assertFalse(c, "Dates are same");
		
	}
}



public class KP
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		KP1 k=new KP1();
		k.login();
		String datedata=k.requestDate();
		System.out.println("Date in main method :"+datedata);
		k.comparedate(datedata);

	}
}