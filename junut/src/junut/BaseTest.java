package junut;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	ChromeDriver driver;
	
	@Before
	public void  OpenBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "/Users/jubaerhosen/Downloads/chromedriver");
	
	ChromeDriver driver = new ChromeDriver();
		
	}
	
	@After
	public void Closebrowser() {
		driver.quit();
	}
	
}
