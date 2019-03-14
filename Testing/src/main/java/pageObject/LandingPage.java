package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	
	By email = By.xpath("//label[@id='loginbutton']");
	By title = By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}





	public WebElement getLogin()
	{
		return driver.findElement(email);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
}
