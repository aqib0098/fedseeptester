package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
public   WebDriver driver;

	public WebDriver initializDriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Users\\MIFTIKH\\workspace\\test\\Testing\\src\\main\\java\\resourse\\data.properties");

		pro.load(fis);
		String browserName = pro.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.inter.driver",
					"D://Users//MIFTIKH//OneDrive - EEOC//_UPF//Desktop//geckodriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}
}
