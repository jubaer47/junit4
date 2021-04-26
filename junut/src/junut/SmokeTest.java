package junut;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
	ChromeDriver driver;
	
	 public SmokeTest(ChromeDriver driver) {
	this.driver= driver;
	
		
	}

	 public void TargetTesting() {
		 
		 Senario senario = new Senario(driver);
		 senario.gotoAnySide("https://www.target.com/");
		 senario.getAttribString(By.id("home"), "id");
		 senario.doaction(By.name("searchTerm")).sendKeys("kids");
		 
		
	}
	 
	 
	 
	 
}
