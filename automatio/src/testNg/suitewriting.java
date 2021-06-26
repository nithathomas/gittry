package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suitewriting {
	
	WebDriver driver;
	long initial;
	long end;
	@BeforeSuite
	public void starting() {
		initial=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe\\");
		driver= new ChromeDriver();
	}
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com/");
	}
	@Test
	public void opencowin() {
	driver.get("https://www.cowin.gov.in/home");
}
	@Test
	public void openiocl() {
		driver.get("https://iocl.com/PeopleCareers/job.aspx");
}
	@AfterSuite
	public void closing() {
		driver.quit();
		end=System.currentTimeMillis();
		long total=end-initial;
		System.out.println(total);
	}
}	