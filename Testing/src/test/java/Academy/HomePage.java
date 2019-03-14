package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;

public class HomePage extends base {

	
	
	@BeforeTest
	public void intial() throws IOException
	{
		driver=initializDriver();
		
	}
	
	@Test
	public void openPage() throws IOException, InterruptedException
	{
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		LandingPage l = new LandingPage(driver); 
	
		Assert.assertTrue(l.getTitle().isDisplayed());
		l.getLogin().click();
	
		
	}
	
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}
