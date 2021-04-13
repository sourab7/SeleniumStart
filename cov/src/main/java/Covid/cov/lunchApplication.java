package Covid.cov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchApplication
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 WebDriver drv= new ChromeDriver();
		 
		 drv.get("https://www.cricbuzz.com/");
		drv.manage().window().maximize();
		
		
		
		
		WebElement iccrank=drv.findElement(By.xpath("//a[contains(text(),'Schedule')]"));
		
		iccrank.click();
	WebElement searchbar=drv.findElement(By.id("search_bar"));
	searchbar.sendKeys("Jigar Gope");
	WebElement search2=drv.findElement(By.xpath("//a[contains(text(),'SEARCH')]"));
	search2.click();
	
		
		Thread.sleep(3000);
		
		WebElement gotohomepage=drv.findElement(By.xpath("//img[@title='Cricbuzz Logo']"));
	gotohomepage.click();
	Thread.sleep(1000);
	
		
		
		drv.quit();
		
		System.out.println("Pagal Jigar");
		
	
}
	}