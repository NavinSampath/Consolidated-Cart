package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class base {
	
	public static WebDriver driver;
	public String browser = "chrome";

	
	public base()
	{
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty(	"webdriver.chrome.driver", "C:\\Users\\Knavi\\Downloads\\2110\\Cart\\Drivers\\chromedriver.exe" );
				driver =new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Knavi\\Downloads\\2110\\Cart\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		
		driver.get("https://www.logitechg.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);

	}
		
		
		
	
	}


}
