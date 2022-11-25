package day3;

import org.testng.annotations.Test;

public class DemoTestNG {
	@Test(priority=1)
	  public void LogIn() 
	  {
		  System.out.println("Login done");
	  }
	  @Test
	  
	  public void createAccount()
	  {
		  System.out.println("Account Created");
	  }
	  @Test(priority=3)
	  
	  public void deleteAccount()
	  {
		  System.out.println("Account Deleted");
		  
	  }
	  @Test(priority=2)
	  
	  public void logoutFromApplication()
	  {
		  System.out.println("logout done");
}
}
