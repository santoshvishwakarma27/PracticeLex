package PkgTest;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerEx implements ITestListener
{
  
  @Override		
  public void onTestSuccess(ITestResult Result)					
  {		
  System.out.println("The name of the testcase passed is :"+Result.getName());					
  }	
  
  @Override		
  public void onTestFailure(ITestResult Result) 					
  {		
  System.out.println("The name of the testcase failed is :"+Result.getName());					
  }
}
