package Covid.cov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube 
{
	
	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		 
		
		
		
		WebDriver dri=new ChromeDriver();
		
		dri.get("https://www.youtube.com/");
		dri.manage().window().maximize();
		
		WebElement ysearch= dri.findElement(By.id("search"));
		ysearch.sendKeys("play date");
		
		WebElement ysearch_bttn= dri.findElement(By.id("search-icon-legacy"));
		ysearch_bttn.click();
		
	//	WebElement selectVdo= dri.findElement(By.xpath(""));
	//	selectVdo.click();
		
		dri.navigate().back();
		dri.navigate().forward(); 
		
		
		
		
		
	}
	
	

}
