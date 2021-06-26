package study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://covid19.who.int/table");
		WebElement x=driver.findElement(By.xpath("//td['India']//following::td[2]"));
	String y=x.getText();
	System.out.println(y);
	
		// TODO Auto-generated method stub

	}

}
