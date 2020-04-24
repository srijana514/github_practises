package king;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class app extends methods{
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.spirit.com/");
		
	}
	@Test
	@AfterMethod
	public void closeBrowser() {
		
	}

}
