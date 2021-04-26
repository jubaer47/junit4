package junut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario {
	
	ChromeDriver driver;
	
	
	public Senario(ChromeDriver driver) {
	 this.driver = driver;
										
		
	}
	

	public void gotoAnySide(String url) {
	driver.get(url);
		
	}
	
	
	public String gettext(By by) {
		String gettext = driver.findElement(by).getText();
		System.out.println(gettext);
		return gettext;
		
	}
	
	
	public String getAttribString(By by, String nameString) {
		String getAtt = driver.findElement(by).getAttribute(nameString);
		System.out.println(getAtt);
		return getAtt;
		
		
	}
	
	public WebElement doaction(By by) {
		return driver.findElement(by);
	}
	
	
}