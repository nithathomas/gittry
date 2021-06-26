package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {
	@Test
	public void google() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe\\");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://selfregistration.cowin.gov.in/");	
	driver.quit();
	}
	@Test
public void gmail() {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe\\");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=fLZO03_TBQU&list=PLLS0D9-W-1dmC4VKY5S98IWze7Z_SuOkn&index=9");
		driver.quit();
}
}