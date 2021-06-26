package study;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class start {

		
	public static void main(String[] args) throws AWTException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium2\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
	
	// driver.close();
		//driver.findElement(By.name("q")).sendKeys("valu"+Keys.ENTER);
		
		//driver.findElement(By.name("q")).sendKeys("cowin"+Keys.ENTER);
		
		//driver.findElement(By.partialLinkText(" SignIn for ...")).click();
		//driver.get("https://www.google.com/search?q=signup+gmail&oq=signup&aqs=chrome.1.69i59j0i20i263i433j0l4j69i60l2.6974j0j7&sourceid=chrome&ie=UTF-8");
		//driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md']")).click();
		//driver.findElement(By.id("firstName")).sendKeys("nidhin");
		
	
	//String x=	driver.findElement(By.id("domainSuffix")).getAttribute("name");
	//System.out.println(x);
	//driver.findElement(By.id("firstName")).clear();
	//WebElement z= driver.findElement(By.xpath("//*[@id=\'passwd\']/div[1]/div/div[1]/input"));
	//boolean y=z.isEnabled();
	//System.out.println(y);
	//WebElement pos=driver.findElement(By.id("selectioni1"));
	//Point p= pos.getLocation();
	//double m=p.getX();
	//double n=p.getY();
	//System.out.println(m);
	//System.out.println(n);
	//WebElement colour=driver.findElement(By.className("jGAaxb"));
	//String c=colour.getCssValue("color");
	//System.out.println(c);
	//WebElement size=driver.findElement(By.className("VfPpkd-vQzf8d"));
	//int ht=size.getSize().getHeight();
	//int width=size.getSize().getWidth();
	//System.out.println("height is " +ht + "width is"+ width);
	 //driver.close();
	
		//driver.get("http://leafground.com/pages/Dropdown.html");
		//WebElement dropdwn=driver.findElement(By.xpath("//*[@id='dropdown1']"));
		//Select s= new Select(dropdwn);
		//s.selectByIndex(1);
		//Thread.sleep(3000);
		//s.selectByValue("3");
		//Thread.sleep(3000);
	//s.selectByVisibleText("Loadrunner");
	//Thread.sleep(10000);
	//WebElement dropdwn1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
	//dropdwn1.sendKeys("UFT/QTP");
		//WebElement dropdwn2=driver.findElement(By.className("dropdown"));
		//Select slt= new Select(dropdwn2);
		//List<WebElement> opt= slt.getOptions();
		//int sz =opt.size();
		//System.out.println(sz);
		
		//WebElement dw3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		//Select last= new Select(dw3);
		//last.selectByVisibleText("Appium");
		//last.selectByVisibleText("UFT/QTP");
		 
		
		//driver.get("http://leafground.com/pages/Alert.html");	
		//WebElement alertbox=driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		//alertbox.click();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		//WebElement alerbox2=driver.findElement(By.xpath("//*[@onclick='confirmAlert()']"));
		//alerbox2.click();
		//Alert alert1=driver.switchTo().alert();
		//alert1.dismiss();
		//WebElement alerbox3=driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']"));
		//alerbox3.click();
		//Alert alert3=driver.switchTo().alert();
		//alert3.sendKeys("find");
		//Thread.sleep(7000);
		//alert3.accept();
		
		//driver.get("http://leafground.com/pages/radio.html");
		//WebElement uncheck=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		//WebElement check=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		//boolean status1=uncheck.isSelected();
		//boolean status2=check.isSelected();
		//System.out.println(status1 );
		//System.out.println(status2 );
		
		//WebElement clk=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
		//clk.click();
		
		//driver.get("http://leafground.com/pages/checkbox.html");
		
		//WebElement ne =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		//if(ne.isSelected())
		//{
			//ne.click();
		//}
		
		
		
		//driver.get("http://leafground.com/pages/Window.html");
		//String old=driver.getWindowHandle();
		//WebElement home=driver.findElement(By.xpath("//*[@id=\'home\']"));
		//home.click();
		//Set<String> newwindows=	driver.getWindowHandles();
		//for (String handles : newwindows)
		//{
			//driver.switchTo().window(handles);
		//}
		//WebElement edit=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		//edit.click();
	
		//driver.close();
		//driver.switchTo().window(old);
		//WebElement multiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		//multiple.click();
		//int siz=driver.getWindowHandles().size();
		//System.out.println(siz);
		//WebElement dontclose=driver.findElement(By.id("color"));
		
		//dontclose.click();
		
		//Set<String>newhandles=driver.getWindowHandles();
		//for (String nh : newhandles) {
			//if( !nh.equals(old))
			//{
				//driver.switchTo().window(nh);
				//driver.close();
			//}
		//}
		
		//driver.quit();
		
		
		//driver.get("http://leafground.com/pages/frame.html");
		//driver.switchTo().frame(0);
		//WebElement framebutton=driver.findElement(By.id("Click"));
		//framebutton.click();
		//Thread.sleep(4000);
		//String tt= framebutton.getText();
		//System.out.println(tt);
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("frame2");
		//WebElement framebutton2=driver.findElement(By.id("Click1"));
		
		//framebutton2.click();

		//driver.switchTo().defaultContent();
		//List<WebElement>total=driver.findElements(By.tagName("iframe"));
		
		//int a=total.size();
		//System.out.println(a); 
		
		//driver.get("http://leafground.com/pages/drop.html");
		//WebElement from=driver.findElement(By.id("draggable"));
		//WebElement to=driver.findElement(By.id("droppable"));
		//Actions acti=new Actions(driver);
		//acti.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//acti.dragAndDrop(from, to).build().perform();
		
		//driver.get("http://leafground.com/pages/tooltip.html");
		//WebElement tooltiptest=driver.findElement(By.id("age"));
	//String text=	tooltiptest.getAttribute("title");
	//System.out.println(text);	
	
	/*driver.get("http://leafground.com/pages/selectable.html");
	List<WebElement> listsize=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
	int no =listsize.size();
	System.out.println(no);
	
		Actions actions =new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(listsize.get(0)).click(listsize.get(1)).click(listsize.get(2)).build().perform();
		
		actions.clickAndHold(listsize.get(0));
		actions.clickAndHold(listsize.get(1));
		actions.clickAndHold(listsize.get(2));
		actions.build().perform();*/
		
		/*driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement optionlist=driver.findElement(By.id("tags"));
		
		optionlist.sendKeys("s");
		Thread.sleep(4000);
		
		List<WebElement>findlist=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int dig=findlist.size();
		System.out.println(dig);
		for (WebElement webElement : findlist) {
			if( webElement.getText().equals("Web Services"))
			{
				webElement.click();
				System.out.println("selecting"+webElement.getText());
				break;
			}
		}*/
		
		/*driver.get("http://leafground.com/pages/download.html");
	   WebElement download=	driver.findElement(By.linkText("Download Excel"));
	   download.click();
	   Thread.sleep(5000);
	   File fileloc= new File("C:\\Users\\admin\\Downloads");
	   File[] filename= fileloc.listFiles();
		for (File file : filename) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("file found");
				break;
			}
		}*/
		
		/*driver.get("http://leafground.com/pages/upload.html");
		Actions a=new Actions(driver);
		WebElement uploadbutton=driver.findElement(By.name("filename"));
	    a.moveToElement( uploadbutton).click().build().perform();
		StringSelection sele= new StringSelection("C:\\Users\\admin\\Selenium interview questions (3).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele, null);
		Robot ul= new Robot();C:\Users\admin\Selenium interview questions (3).pdf
		ul.keyPress(KeyEvent.VK_ENTER);
		ul.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		ul.keyPress(KeyEvent.VK_CONTROL);
		ul.keyPress(KeyEvent.VK_V);
		ul.keyRelease(KeyEvent.VK_V);
		ul.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		ul.keyPress(KeyEvent.VK_ENTER);
		ul.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		/*driver.get("http://leafground.com/pages/Image.html");
		WebElement imagebox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if( imagebox.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken"); 
		}else
		{
			System.out.println("not broken");
		}*/
		
		
		
		
		
		/*driver.get("http://leafground.com/pages/Link.html");
		WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		
		driver.navigate().back();
		WebElement where=driver.findElement(By.partialLinkText("Find where am supposed to go without "));
		
		String set=where.getAttribute("href");
		System.out.println(set);
		WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("link is broken");
		}
		driver.navigate().back();
		WebElement home1=driver.findElement(By.linkText("Go to Home Page"));
		home1.click();
		driver.navigate().back();
		List<WebElement>count=driver.findElements(By.tagName("a"));
		int n=count.size();
		System.out.println(n);*/
		
		
		/*driver.get("http://leafground.com/pages/Calendar.html");
		
		WebElement calender=driver.findElement(By.id("datepicker"));
		calender.click();
		WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		WebElement datetobe= driver.findElement(By.xpath("//a[contains(text(),'20')]"));
		datetobe.click();*/
		
		
		/*driver.get("http://leafground.com/pages/sortable.html");
		List<WebElement>droppable=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement from=droppable.get(6);
		WebElement to=droppable.get(0);
		Actions act=new Actions(driver);
		act.clickAndHold(from);
		act.moveToElement(to);
		act.release();
		act.build().perform();*/
		
		
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int col=column.size();
		System.out.println(col); 
		
		List<WebElement >rows=driver.findElements(By.tagName("tr"));
		int ro=rows.size();
		System.out.println(ro);
		
		WebElement progress=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	     String finalprogress=	progress.getText();
		System.out.println(finalprogress);
		
		List<WebElement>all=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer>nolist=new ArrayList<Integer>();
		for (WebElement webElement : all) {
		String all1=	webElement.getText().replace("%", "");
		nolist.add(Integer.parseInt(all1));
		}
		System.out.println(nolist);
		
		
		int smallvalue=Collections.min(nolist);
		System.out.println(smallvalue);
	  String finalstage=	Integer.toString(smallvalue)+"%";
	  String finalxpath="//td[normalize-space()="+"\""+finalstage+"\""+"]"+"//following::td[1]";
		System.out.println(finalxpath);
	  WebElement checkb=driver.findElement(By.xpath(finalxpath));
	checkb.click();
		}
		
		}
		

		
		
	
	

